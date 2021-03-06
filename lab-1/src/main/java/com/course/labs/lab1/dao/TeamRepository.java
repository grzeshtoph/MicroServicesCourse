package com.course.labs.lab1.dao;

import com.course.labs.lab1.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created on 10/20/17.
 */
@RestResource(path = "teams", rel = "teams")
public interface TeamRepository extends CrudRepository<Team, Long> {
}
