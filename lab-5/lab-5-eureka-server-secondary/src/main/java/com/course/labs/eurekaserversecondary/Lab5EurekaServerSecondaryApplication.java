package com.course.labs.eurekaserversecondary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab5EurekaServerSecondaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5EurekaServerSecondaryApplication.class, args);
	}
}
