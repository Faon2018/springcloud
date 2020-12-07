package com.faon.springcloud.controller;

import com.faon.springcloud.entities.User;
import com.faon.springcloud.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/provider/user")
@RefreshScope
public class UserController {


    @Autowired
    private UserServiceImpl userServiceImpl;



    @GetMapping("/select/{id}")
    public User userTest(@PathVariable("id") int id){
        return userServiceImpl.selectUserById(id);
    }
}
