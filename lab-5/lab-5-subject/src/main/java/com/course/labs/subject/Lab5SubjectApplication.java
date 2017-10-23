package com.course.labs.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5SubjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5SubjectApplication.class, args);
	}
}
