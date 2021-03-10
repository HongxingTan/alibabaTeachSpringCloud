package com.alitantan001.orderservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/hello")
    public String getOrder() {
        return "Hello Spring Cloud";
    }
}
