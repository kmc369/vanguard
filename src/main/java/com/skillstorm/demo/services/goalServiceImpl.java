package com.skillstorm.demo.services;

import com.skillstorm.demo.models.goal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.repositories.goalrepo;

@Service
public class goalServiceImpl  implements goalService {
	
	@Autowired
	private goalrepo repo;

	@Override
	public List<goal> findAll() {
		
		//return repo.findAll();
		return null;
	}

	@Override
	public goal findById(int id) {
		
		//null check to make sure that the goal is present
		Optional<goal> goal = repo.findById(id);
		return goal.isPresent() ? goal.get(): null;
	}

	@Override
	public goal save(goal goal) {
		return repo.save(goal);
	
	}

	@Override
	public goal update(goal goal) {
		return repo.save(goal);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
		
	}





}
