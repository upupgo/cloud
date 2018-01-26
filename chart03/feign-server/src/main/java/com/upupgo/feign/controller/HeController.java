package com.upupgo.feign.controller;

import com.upupgo.feign.faces.SchedualErekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeController {
    @Autowired
    private SchedualErekaClient schedualErekaClient;
    @GetMapping
    public  String sayHello(){
        return schedualErekaClient.sayHelloFromClientOne();
    }
}
