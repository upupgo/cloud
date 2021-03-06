package com.upupgo.wzf.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/hello")
    public String hello(){
        return "hello word server port:"+port+"!!!!";
    }
}
