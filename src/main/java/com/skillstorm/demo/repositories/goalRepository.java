package com.skillstorm.demo.repositories;







import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.goal;

@Repository
public interface goalRepository extends CrudRepository <goal,Integer> {


}
