package com.chaitanya.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.chaitanya.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	//custom finder
	public List<User> findByName(String name);
	
	//JPQL
	@Query("Select u FROM User u")
	public List<User> getAllUserJPQL();
	
	@Query("Select u FROM User u Where u.name =:n")
	public List<User> getUserByNameJPQL(@Param("n") String name);
	
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUserusingSQL();
	
}
