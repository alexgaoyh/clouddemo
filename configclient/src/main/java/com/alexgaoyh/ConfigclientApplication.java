package com.alexgaoyh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigclientApplication {

    @Value("${env.name:World!}")
    private String bar;

    @RequestMapping("/configclient")
    String hello() {
        return "Hello " + bar + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }
}
