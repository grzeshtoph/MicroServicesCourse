package com.course.labs.lab4eurekaserversecondary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab4EurekaServerSecondaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4EurekaServerSecondaryApplication.class, args);
	}
}
