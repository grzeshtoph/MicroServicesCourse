package com.course.labs.lab1;

import com.course.labs.lab1.dao.TeamRepository;
import com.course.labs.lab1.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 10/20/17.
 */
//@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/teams/{id}")
    public Team getTeam(@PathVariable  Long id) {
        return teamRepository.findOne(id);
    }
}
