package com.course.labs.lab3server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab3ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ConfigServerApplication.class, args);
	}
}
