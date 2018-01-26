package com.upupgo.feign.faces.impl;
import com.upupgo.feign.faces.SchedualErekaClient;
import org.springframework.stereotype.Component;

@Component
public class SchedualErekaClientImpl implements SchedualErekaClient {
    @Override
    public String sayHelloFromClientOne() {
        return "I am  sorry errror!!!!!!";
    }
}
