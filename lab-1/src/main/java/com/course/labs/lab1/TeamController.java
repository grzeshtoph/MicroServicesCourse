package com.course.labs.lab1;

import com.course.labs.lab1.domain.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 10/20/17.
 */
@RestController
public class TeamController {
    @GetMapping("/teams")
    public List<Team> getTeams() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setId(0l);
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        list.add(team);

        team = new Team();
        team.setId(1l);
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        return list;
    }
}
