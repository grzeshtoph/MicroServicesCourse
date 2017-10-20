package com.course.labs.lab1.dao;

import com.course.labs.lab1.domain.Team;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 10/20/17.
 */
public interface TeamRepository extends CrudRepository<Team, Long> {
}
