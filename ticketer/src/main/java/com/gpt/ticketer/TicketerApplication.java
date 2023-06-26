package com.gpt.ticketer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketerApplication.class, args);
	}

}
