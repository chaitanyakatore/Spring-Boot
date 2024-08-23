package com.example.practice.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.practice.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

    
}