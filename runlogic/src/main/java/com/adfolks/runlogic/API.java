package com.adfolks.runlogic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    @Value("${client.name}")
    String name;
    @RequestMapping("/test")
    public String test(){
        return "Hello "+name;
    }
}