package com.arrkgroup.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
public class Application {
	public static void main(String[] args) {
		// Tell server to look for users-server.properties or
		// users-server.yml
		System.setProperty("spring.config.name", "users-server");

		SpringApplication.run(Application.class, args);
	}

}
