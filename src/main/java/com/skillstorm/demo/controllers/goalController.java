package com.skillstorm.demo.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.services.goalServiceImpl;

@RestController
@RequestMapping("/goals")
public class goalController {

	@Autowired
	private goalServiceImpl service;

	@GetMapping("/{id}")
	public goal findById(@PathVariable int id) {
		return service.findById(id);
	} 
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PostMapping
	public goal save(@Valid @RequestBody goal goal) {
		return service.save(goal);
	}
	
	

	
	
	
	
	
	
	
	//save a goal
	
	
	//update a goal
	
	
	
	//delete a goal
	
	
	
}
