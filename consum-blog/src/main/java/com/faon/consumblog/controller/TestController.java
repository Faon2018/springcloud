package com.faon.consumblog.controller;


import com.faon.springcloud.entities.User;
import com.faon.springcloud.util.ResponsResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
@RequestMapping("/consum/blog/api")//消费者对外api接口
@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consum/blog/get/{id}")
    public User test(@PathVariable("id") int id){
        return  restTemplate.getForObject("http://provider-user-service/provider/user/select/"+id,User.class);
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponsResult login(User user){
//        return  restTemplate.getForObject("http://provider-user-service/provider/user/select/"+id,User.class);
        if (user.getUsername().isEmpty()){
            return new ResponsResult(500,"登陆失败！");
        }else {
            return new ResponsResult(200,"登录成功！");
        }

    }
}
