package com.faon.consumblog.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApplicationContext {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
