package com.xwycloud11.springcloud.helloworld.feign.client.Service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.xwycloud11.springcloud.helloworld.feign.client.Service.HelloWorldServiceFailure;



@FeignClient(name = "SERVICE-HELLOWORLD", fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {
	
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
    
}