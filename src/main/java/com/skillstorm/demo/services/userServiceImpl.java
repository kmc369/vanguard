package com.skillstorm.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.repositories.userRepository;

@Service
public class userServiceImpl implements userService{
	
	@Autowired
	private userRepository repo;
	@Override
	public List<goal> findGoalsByUserId(int id) {
		return repo.findGoalsByUserId(id);
	}

}
