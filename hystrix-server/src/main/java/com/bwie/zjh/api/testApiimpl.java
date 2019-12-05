package com.bwie.zjh.api;

import org.springframework.stereotype.Component;

@Component
public class testApiimpl implements TesApi{


    @Override
    public String ses(String name) {
        return "出错了";
    }
}
