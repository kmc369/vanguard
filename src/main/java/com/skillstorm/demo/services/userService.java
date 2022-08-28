package com.skillstorm.demo.services;

import java.util.List;


import com.skillstorm.demo.models.goal;




public interface userService {
	
	//public List<goal> findGoalsByUserId(int id);
	public goal save(goal goal);
	public goal update(goal goal);
	public void deleteById(int id);

}
