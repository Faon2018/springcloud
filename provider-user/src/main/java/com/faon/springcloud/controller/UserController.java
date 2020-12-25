package com.faon.springcloud.controller;

import com.faon.springcloud.entities.User;
import com.faon.springcloud.service.impl.UserServiceImpl;
import com.faon.springcloud.util.ResponsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/provider/user")
@RefreshScope
public class UserController {


    @Autowired
    private UserServiceImpl userServiceImpl;
    @Value("${server.port}")
    private int port;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResponsResult addUser(User user){
        int i = userServiceImpl.addUser(user);
        return  new ResponsResult(200,"添加成功",userServiceImpl.selectUserById(i));
    }

    @GetMapping("/select/{id}")
    public User userTest(@PathVariable("id") int id){
        return userServiceImpl.selectUserById(id);
    }


    @GetMapping("/test")
    public String test(){
        return "端口："+port;
    }


}
