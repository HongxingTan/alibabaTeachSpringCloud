package com.alitantan001.feignclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private OrderProxy proxy;

    @HystrixCommand(fallbackMethod = "fallbackMethod", commandProperties ={
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    @RequestMapping("/test")
    public String test() {
        return proxy.hi();
    }

    @RequestMapping("/hi")
    public String hi() {
        return proxy.hi();
    }

    //微服务Fallback熔断降级
    public String fallbackMethod() {
        return "Spring Cloud微服务Fallback熔断降级";
    }
}
