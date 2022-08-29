package com.skillstorm.demo.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.services.goalServiceImpl;

@RestController
@RequestMapping("/goals")
public class goalController {

	@Autowired
	private goalServiceImpl service;
	//find all goals 
	/*@GetMapping()
	public List<goal> findGoalByUserId(){
		LinkedList<goal> goals = new LinkedList<>();
		
		return goals;
	}
	*/
	@GetMapping("/{id}")
	public goal findById(@PathVariable int id) {
		return service.findById(id);
	} 
	
	
	
	
	
	
	
	
	
	
	
	//save a goal
	
	
	//update a goal
	
	
	
	//delete a goal
	
	
	
}
