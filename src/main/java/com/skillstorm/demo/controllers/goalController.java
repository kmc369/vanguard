package com.skillstorm.demo.controllers;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/allGoals")
	public List<goal> findAll(){
	
		return service.findAll();
		
	}
	

	@GetMapping("/allGoals/{id}")
	public List<goal> findByUserId (@PathVariable int id){
		
	  return service.findByUserId(id);
	}
	

	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PostMapping
	public goal save(@Valid @RequestBody goal goal) {
		return service.save(goal);
	}
	
	@PutMapping("/{id}")
	public goal update(@Valid @RequestBody goal goal ,@PathVariable int id) {
		goal.setId(id);
		return service.update(goal);
	}
	
	

	
	
	
	
	
	
	
	//save a goal
	
	
	//update a goal
	
	
	
	//delete a goal
	
	
	
}
