package com.faon.consumblog.controller;


import com.faon.springcloud.entities.User;
import com.faon.springcloud.util.ResponsResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
//@CrossOrigin(origins = "http://example.com")//允许来自example.com的请求调用
@RequestMapping("/consum/blog/api/")//消费者对外api接口
@RestController
@RefreshScope
public class TestController {
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/get/{id}")
    public User test(@PathVariable("id") int id){
        return  restTemplate.getForObject("http://provider-user-service/provider/user/select/"+id,User.class);
    }

    @PostMapping("/login")
    public ResponsResult login(User user){
        User userInfo = restTemplate.getForObject("http://provider-user-service/provider/user/select/"+1,User.class);
        if (user.getUsername().isEmpty()){
            return new ResponsResult(500,"登陆失败！");
        }else {
            return new ResponsResult(200,"登录成功！",userInfo);
        }

    }
}
