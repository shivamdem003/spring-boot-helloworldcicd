package com.example.gitCICD.CICD_JAVA.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello/")
    public String hello(){
        return "Hello to CICD";
    }
}
