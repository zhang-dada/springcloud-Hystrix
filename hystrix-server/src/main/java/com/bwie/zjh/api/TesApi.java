package com.bwie.zjh.api;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ribbon02",fallback = testApiimpl.class)
@Hystrix
public interface TesApi {
    @RequestMapping("test01")
    public String ses(String name);
}