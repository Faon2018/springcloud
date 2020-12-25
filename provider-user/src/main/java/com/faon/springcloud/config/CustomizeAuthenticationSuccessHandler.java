package com.faon.springcloud.config;

import com.alibaba.fastjson.JSON;
import com.faon.springcloud.entities.Menu;
import com.faon.springcloud.entities.Permission;
import com.faon.springcloud.entities.Role;
import com.faon.springcloud.service.UserService;
import com.faon.springcloud.util.ResponsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Autowired
    UserService userServiceImpl;

    /**
     *成功认证后的处理方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param authentication
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        //更新用户表上次登录时间、更新人、更新时间等字段
        User userDetails = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        com.faon.springcloud.entities.User sysUser = userServiceImpl.selectUserByUserName(userDetails.getUsername());
       

        //此处还可以进行一些处理，比如登录成功之后可能需要返回给前台当前用户有哪些菜单权限，
        //进而前台动态的控制菜单的显示等，具体根据自己的业务需求进行扩展
        //返回认证成功后的菜单信息
        List<Menu> menus = new ArrayList<>(0);
        List<Role> roles = sysUser.getRoles();
        for (Role role : roles) {
            List<Permission> permissions = role.getPermissions();
            for (Permission per : permissions) {
                menus.addAll(per.getMenus());
            }
        }
        httpServletResponse.setContentType("text/json;charset=utf-8");
        //塞到HttpServletResponse中返回给前台
        httpServletResponse.getWriter().write(JSON.toJSONString(new ResponsResult(200,"登陆成功!",menus)));
    }
}
