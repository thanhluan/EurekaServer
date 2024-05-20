package com.eureka.server.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSpringMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSpringMicroServiceApplication.class, args);
	}

}
