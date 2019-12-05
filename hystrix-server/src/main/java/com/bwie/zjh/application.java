package com.bwie.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@RestController
@EnableCircuitBreaker
public class application {
    public static void main(String[] args) {
        SpringApplication.run(application.class);
    }

    @RequestMapping("/test01")
    public String test(){
        System.out.println("================");
        return "test01-ok";
    }
}
