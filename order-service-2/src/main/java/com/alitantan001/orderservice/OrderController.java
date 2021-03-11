package com.alitantan001.orderservice;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Bean
    public IRule createIRule(){
        return new RoundRobinRule();
    }

    @RequestMapping("/hello")
    public String getOrder() throws InterruptedException {

        Thread.sleep(10);
        return "Hello Spring Cloud 2";
    }
}
