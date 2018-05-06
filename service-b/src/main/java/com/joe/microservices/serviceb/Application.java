package com.joe.microservices.serviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

    @GetMapping(path = "/ping")
    public String ping() {
        return "Hi from Service B";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
