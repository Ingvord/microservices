package com.joe.microservices.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

    @GetMapping(path = "/service-a")
    public String ping() {
        return "Hello from Service A";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
