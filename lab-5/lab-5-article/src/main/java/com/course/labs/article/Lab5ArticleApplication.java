package com.course.labs.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5ArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5ArticleApplication.class, args);
	}
}
