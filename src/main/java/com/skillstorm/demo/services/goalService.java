package com.skillstorm.demo.services;




import com.skillstorm.demo.models.goal;

public interface goalService {

	public goal findById(int id);
	public void deleteById(int id);
	public goal save(goal goal);

}
