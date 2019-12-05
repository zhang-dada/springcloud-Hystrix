package com.bwie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Applicatons {
    public static void main(String[] args) {
        SpringApplication.run(Applicatons.class);
    }

    @RequestMapping("test02")
    public String ad(){
        return "ok---------";
    }
}
