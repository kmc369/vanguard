package com.skillstorm.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.repositories.goalRepository;

@Service
public class goalServiceImpl  implements goalService {

	@Autowired 
	private goalRepository repository;

	@Override
	public goal findById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public goal save(goal goal) {
		return repository.save(goal);
	}

	@Override
	public goal update(goal goal) {
		return repository.save(goal);
	}

	@Override
	public List<goal> findAll() {
		 List<goal> goals = (List<goal>) repository.findAll();
		 return goals;
	}









	





	
	
	

}
