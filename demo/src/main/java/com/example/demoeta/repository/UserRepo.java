package com.example.demoeta.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoeta.model.User;

@Repository("userRepository")
public interface UserRepo extends CrudRepository<User, String>{
	User findByEmailIdIgnoreCase(String emailId);
	@Query("select userid from User")
	public long[] ids();
}
