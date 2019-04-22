package com.xwycloud11.springcloud.helloworld.feign.client.Service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloWorldService {
    @Override
    public String sayHello() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }


}
