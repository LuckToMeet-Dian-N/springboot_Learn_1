package com.wen.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "hello" )
    public String HelloWork(){
        return "Hello My first Springboot";
    }

}
