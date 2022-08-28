package com.skillstorm.demo.repositories;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.goal;
import com.skillstorm.demo.models.user;


@Repository
public interface userRepository extends JpaRepository<user,Integer> {
	
	/*

	@Query("select g from goals g where g.users.id = ?1")
	public List<goal> findGoalsByUserId(int id);
	*/
}

