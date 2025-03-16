package com.example.github_CICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    
    @GetMapping("/hello")
    public String home() {
        return "hello world";
    }
}
