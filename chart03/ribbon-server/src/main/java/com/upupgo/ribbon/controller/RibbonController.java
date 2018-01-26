package com.upupgo.ribbon.controller;
import com.upupgo.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/hello")
    public String hello(){
        return helloService.helloService();
    }
}
