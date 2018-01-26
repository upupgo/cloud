package com.upupgo.feign.faces;

import com.upupgo.feign.faces.impl.SchedualErekaClientImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "client-eureka",fallback =SchedualErekaClientImpl.class )
public interface SchedualErekaClient{

    @GetMapping("/hello")
    String sayHelloFromClientOne();
}
