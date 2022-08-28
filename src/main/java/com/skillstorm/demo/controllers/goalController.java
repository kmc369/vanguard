package com.skillstorm.demo.controllers;
import com.skillstorm.demo.models.goal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.services.goalService;


@RestController
@CrossOrigin("*")
@RequestMapping("/goals")
public class goalController {
	
	@Autowired
	private goalService service;
	//find all the goals of the user
	
	
	@GetMapping
	public List<goal> findAll(){
		return service.findAll();
	}
	
	
	//find goals by id
	
	@GetMapping("/{id}")
	public goal findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	
	
	//create a new goal 
	@PostMapping
	public goal create(@Valid @RequestBody goal goal) {
		
		return service.save(goal);
	}
	
	//update goals

	@PutMapping("/{id}")
	public goal update(@Valid @RequestBody goal goal, @PathVariable int id) {
		goal.setId(id);
		return service.update(goal);
	}
	
	
	
	//delete a goal by id
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		service.deleteById(id);
	}

}
