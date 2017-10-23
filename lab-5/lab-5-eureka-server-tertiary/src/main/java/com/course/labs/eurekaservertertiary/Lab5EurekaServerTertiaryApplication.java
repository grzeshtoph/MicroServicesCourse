package com.course.labs.eurekaservertertiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Lab5EurekaServerTertiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5EurekaServerTertiaryApplication.class, args);
	}
}
