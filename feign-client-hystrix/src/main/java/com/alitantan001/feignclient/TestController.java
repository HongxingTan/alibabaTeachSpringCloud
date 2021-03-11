package com.alitantan001.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private OrderProxy proxy;

    @RequestMapping("/test")
    public String hi() {
        return proxy.hi();
    }

    @RequestMapping("/hi")
    public String hi1() {
        return proxy.hi();
    }
}
