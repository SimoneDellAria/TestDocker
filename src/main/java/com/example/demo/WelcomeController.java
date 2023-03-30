package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayHello(){
        return "Hello From Docker Image!";
    }
}
