package com.example.server;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBackendApplication.class, args);
    }

    @GetMapping("/api/hello")
    public String hello() {
        return String.format("Hello Spring");
    }
}
