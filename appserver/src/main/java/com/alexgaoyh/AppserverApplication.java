package com.alexgaoyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient  //激活eureka中的DiscoveryClient实现
@SpringBootApplication
@RestController
public class AppserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppserverApplication.class, args);
	}

	@RequestMapping("/helloworld")
	public String helloWorld() {
		return "this is a return str from app server (APP-SERVER)";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
