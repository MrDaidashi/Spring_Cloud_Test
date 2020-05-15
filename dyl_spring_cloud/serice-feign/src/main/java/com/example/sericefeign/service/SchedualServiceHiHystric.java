package com.example.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
//SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
