package com.alitantan001.orderservice;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Bean
    public IRule createIRule(){
        return new RandomRule();
    }

    @RequestMapping("/hello")
    public String getOrder() {
        return "Hello Spring Cloud 2";
    }
}
