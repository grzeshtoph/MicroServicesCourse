package com.course.labs.lab1;

import com.course.labs.lab1.dao.TeamRepository;
import com.course.labs.lab1.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lab1Application extends SpringBootServletInitializer {

	@Autowired
	private TeamRepository teamRepository;

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

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		list.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		teamRepository.save(list);
	}
}
