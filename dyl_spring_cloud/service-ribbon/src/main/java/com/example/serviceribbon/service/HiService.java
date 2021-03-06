package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {

    @Autowired
    RestTemplate restTemplate;

    //加上@HystrixCommand注解，创建熔断器功能，并指定了fallbackMethod熔断方法
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }
    public String hiError(String name){
        return "hi,"+name+"sorry error";
    }
}
