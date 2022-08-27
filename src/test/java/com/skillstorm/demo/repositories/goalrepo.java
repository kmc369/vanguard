package com.skillstorm.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.controllers.goal;

@Repository //annotation to let spring know this is a repo
public interface goalrepo extends CrudRepository<goal, Integer>{ //the object and the id

	public goal findGoalById();
}
