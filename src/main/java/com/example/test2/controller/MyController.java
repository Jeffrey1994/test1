package com.example.test2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController  {
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1() {
        return "Hello!!!" ;
    }

    @RequestMapping("/test2")
    public String home() {
        return "test2";
    }
}
