package com.base;


import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.base.bean.Person;
import com.base.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {} ", dao.getAll());
		
		logger.info("user id 1011 -> {} ", dao.findById(1011));
		
		logger.info("delete id 1041 -> deletd row - {} ", dao.deleteById(1011));
		
		logger.info("Inserted new person -> {}", dao.insert(new Person(1051, "Bunti", "Nasik", 
				new Date(System.currentTimeMillis()))));
		
		logger.info("Inserted new person -> {}", dao.update(new Person(1041, "Chaitanya", "Nasik", 
				new Date(System.currentTimeMillis()))));

	}
}
