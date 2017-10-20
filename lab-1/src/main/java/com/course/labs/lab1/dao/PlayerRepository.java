package com.course.labs.lab1.dao;

import com.course.labs.lab1.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created on 10/20/17.
 */
@RestResource(path = "players", rel = "players")
public interface PlayerRepository extends CrudRepository<Player, Long>{
}
