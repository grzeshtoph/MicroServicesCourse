package com.course.lab.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5NounApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5NounApplication.class, args);
	}
}
