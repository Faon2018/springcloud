package com.faon.consumblog.controller;


import com.faon.springcloud.util.ResponsResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consum/blog/get/{id}")
    public String test(@PathVariable("id") int id){
        return  restTemplate.getForObject("http://provider-user-service:8001/provider/user/get/"+id,String.class);
    }
}
