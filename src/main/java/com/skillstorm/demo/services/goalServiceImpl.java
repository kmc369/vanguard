package com.skillstorm.demo.services;

import java.util.List;
import java.util.Set;

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





	
	
	

}
