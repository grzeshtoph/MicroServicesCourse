package com.course.labs.lab1;

import com.course.labs.lab1.dao.TeamRepository;
import com.course.labs.lab1.domain.Player;
import com.course.labs.lab1.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		Set<Player> players = new HashSet<>();
		players.add(new Player().name("Big Easy").position("Showman"));
		players.add(new Player().name("Buckets").position("Guard"));
		players.add(new Player().name("Dizzy").position("Guard"));

		teamRepository.save(Arrays.asList(
				new Team().location("Harlem").name("Globetrotters").players(players),
				new Team().location("Washington").name("Generals"))
		);
	}
}
