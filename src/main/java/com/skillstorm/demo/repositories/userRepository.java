package com.skillstorm.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.models.user;

@Repository
public interface userRepository extends CrudRepository<goal,Integer> {

	public List<goal> findGoalsByUserId(int id);
}
