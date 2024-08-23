package com.chaitanya;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chaitanya.entities.User;
import com.chaitanya.repo.UserRepository;

@SpringBootApplication
public class LeaningApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LeaningApplication.class, args);
		UserRepository useRepository = context.getBean(UserRepository.class);
		
//		User user1 = new User();
//		user1.setName("Chaitanya Katore");
//		user1.setCity("Pune");
//		user1.setCountry("India");
//		
//		User savedUser = useRepository.save(user1);
//		System.out.println(savedUser);
//
//
//		User user2 = new User();
//		user2.setName("Sunita Katore");
//		user2.setCity("Nasik");
//		user2.setCountry("India");
//		
//		
//		List<User> list = List.of(user1, user2);
//		useRepository.saveAll(list);
//		
//		//for printig it;
//		Iterable<User> users = useRepository.saveAll(list);
//		users.forEach(user->{
//			System.out.println(user);
//		});
		
//		//UPDATE
//		Optional<User> optional = useRepository.findById(352);
//		User user = optional.get();
//		
//		user.setName("Bittu");
//		
//		useRepository.save(user);
		
//		//READ
//		
//		Iterable<User> allUsers = useRepository.findAll();
//		for (User user : allUsers) {
//			System.out.println(user);
//		}
		
//		//Delete
//		useRepository.deleteById(152);
		
		
//		// Custom Finder
//		
//		List<User> list = useRepository.findByName("Chaitanya Katore");
//		list.forEach(e->System.out.println(e));
		
		//JPQL
		
//		// List<User> allUsers = useRepository.getAllUserJPQL();
//		List<User> allUsers = useRepository.getUserByNameJPQL("Chaitanya Katore");
//		allUsers.forEach(e->System.out.println(e));
//		
		
		//JPQL + SQL native Query
		List<User> allUsers = useRepository.getUserusingSQL();
		allUsers.forEach(e->System.out.println(e));
		
		
		
		
		
	}

}
