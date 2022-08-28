package com.skillstorm.demo.services;

import java.util.List;
import com.skillstorm.demo.models.goal;


public interface goalService {
	
	public List<goal> findAll(); //find all goals of each user
	public goal findById(int id); // find a specific goal of user 
	public goal save(goal goal); //save user goal
	public goal update(goal goal);
	public void deleteById(int id); //delete goal by id
	
	

	
	

}
