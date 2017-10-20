package com.course.labs.lab1.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created on 10/20/17.
 */
@Entity
public class Team {
    private Long id;
    private String name;
    private String location;
    private String mascot;
    private Set<Player> players;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public Team id(Long id) {
        this.id = id;
        return this;
    }

    public Team name(String name) {
        this.name = name;
        return this;
    }

    public Team location(String location) {
        this.location = location;
        return this;
    }

    public Team mascot(String mascot) {
        this.mascot = mascot;
        return this;
    }

    public Team players(Set<Player> players) {
        this.players = players;
        return this;
    }
}
