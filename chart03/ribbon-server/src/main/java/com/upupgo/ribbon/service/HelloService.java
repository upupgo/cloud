package com.upupgo.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String helloService(){
        return restTemplate.getForObject("http://client-eureka/hello",String.class);
    }

    public String hiError(){
        return "hi ,sorry error!!!!!";
    }

}
