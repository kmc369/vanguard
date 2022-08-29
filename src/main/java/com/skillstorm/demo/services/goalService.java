package com.skillstorm.demo.services;




import java.util.List;

import com.skillstorm.demo.models.goal;

public interface goalService {

	public List<goal> findAll();
	public goal findById(int id);
	public void deleteById(int id);
	public goal save(goal goal);
	public goal update(goal goal);
	public List<goal> findByUserId(int id);

}
