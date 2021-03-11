package com.alitantan001.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("order-microservice")
public interface OrderProxy {

    @RequestMapping("/hello")
    String hi();
}
