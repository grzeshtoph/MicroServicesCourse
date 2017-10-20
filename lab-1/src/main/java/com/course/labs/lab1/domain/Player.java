package com.course.labs.lab1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created on 10/20/17.
 */
@Entity
public class Player {
    private Long id;
    private String name;
    private String position;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Player id(Long id) {
        this.id = id;
        return this;
    }

    public Player name(String name) {
        this.name = name;
        return this;
    }

    public Player position(String position) {
        this.position = position;
        return this;
    }
}
