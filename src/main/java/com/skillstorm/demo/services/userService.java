package com.skillstorm.demo.services;

import java.util.List;

import com.skillstorm.demo.models.goal;

public interface userService {

	public List<goal> findGoalsByUserId(int id);
}
