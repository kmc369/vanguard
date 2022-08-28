package com.skillstorm.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.services.userService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private userService service;
	
	
	/*@GetMapping("/{id}")
	public List<goal> getGoalsByUserId(@PathVariable int id) {
		
		log.trace("Got here!");
		return service.findGoalsByUserId(id);
	}
*/
}
