package com.course.labs.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Lab1Application extends SpringBootServletInitializer {

	/**
	 * Runs for JAR packaging.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	/**
	 * Runs for WAR packaging.
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Lab1Application.class);
	}
}
