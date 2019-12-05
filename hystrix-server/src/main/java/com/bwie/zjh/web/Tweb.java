package com.bwie.zjh.web;

import com.bwie.zjh.api.TesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tweb {
    @Autowired
    private TesApi tesApi;

    @RequestMapping("test02")
    public String sel(){
        String ses = tesApi.ses("123");

        return ses;
    }

}
