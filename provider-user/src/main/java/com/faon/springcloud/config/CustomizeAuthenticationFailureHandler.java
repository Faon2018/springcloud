package com.faon.springcloud.config;

import com.alibaba.fastjson.JSON;
import com.faon.springcloud.util.ResponsResult;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomizeAuthenticationFailureHandler implements AuthenticationFailureHandler {

    /**
     * 认证失败的处理方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param e
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        //返回json数据
        ResponsResult result = null;
        if (e instanceof AccountExpiredException) {
            //账号过期
            result = new ResponsResult(2001,"账号过期",null);
        } else if (e instanceof BadCredentialsException) {
            //密码错误
            result = new ResponsResult(2001,"密码错误",null);
        } else if (e instanceof CredentialsExpiredException) {
            //密码过期
            result = new ResponsResult(2001,"密码过期",null);
        } else if (e instanceof DisabledException) {
            //账号不可用
            result = new ResponsResult(2001,"账号不可用",null);
        } else if (e instanceof LockedException) {
            //账号锁定
            result = new ResponsResult(2001,"账号锁定",null);
        } else if (e instanceof InternalAuthenticationServiceException) {
            //用户不存在
            result = new ResponsResult(2001,"用户不存在",null);
        }else{
            //其他错误
            result = new ResponsResult(2001,"其他错误",null);
        }
        //处理编码方式，防止中文乱码的情况
        httpServletResponse.setContentType("text/json;charset=utf-8");
        //塞到HttpServletResponse中返回给前台
        httpServletResponse.getWriter().write(JSON.toJSONString(result));
    }
}
