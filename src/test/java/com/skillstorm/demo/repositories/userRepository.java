package com.skillstorm.demo.repositories;




import org.springframework.data.repository.CrudRepository;

import com.skillstorm.demo.models.user;

public interface userRepository extends CrudRepository<user,Integer> {

	
}
