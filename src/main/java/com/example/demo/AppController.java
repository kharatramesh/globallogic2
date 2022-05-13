package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
public class AppController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello 1";
    }
}
