package com.skillstorm.demo.repositories;

import com.skillstorm.demo.models.goal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository //annotation to let spring know this is a repo
public interface goalrepo extends CrudRepository<goal, Integer>{ //the object and the id

	
}
