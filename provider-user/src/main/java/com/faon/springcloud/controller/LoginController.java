package com.faon.springcloud.controller;

import com.faon.springcloud.entities.User;
import com.faon.springcloud.util.ResponsResult;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理各微服务的登录
 */
@RestController
@RequestMapping("/user")
@RefreshScope
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponsResult login(User user){
        return  new ResponsResult(200,"login ",user);
    }

}
