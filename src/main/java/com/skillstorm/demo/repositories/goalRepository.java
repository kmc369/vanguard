package com.skillstorm.demo.repositories;





import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.goal;

@Repository
public interface goalRepository extends CrudRepository <goal,Integer> {

	@Query("select g from goal g where g.user.id = ?1")
	public List<goal> findByUserId(int id);

}
