package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.test.SpringCloudGatewayApplication.class, args);
    }
}
