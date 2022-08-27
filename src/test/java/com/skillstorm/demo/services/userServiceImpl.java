package com.skillstorm.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.repositories.userRepository;

@Service
public class userServiceImpl implements userService {
	
	
	private userRepository repo;

	@Override
	public List<goal> findAllGoalsByUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public goal findGoalByUserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public goal save(goal goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public goal update(goal goal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
