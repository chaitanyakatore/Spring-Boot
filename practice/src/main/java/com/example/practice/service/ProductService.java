package com.example.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.entities.Product;
import com.example.practice.repo.ProductRepository;

@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    // Read
    public List<Product> getAllProduct(){
        List<Product> list = (List) productRepository.findAll();
        return list;
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById((long) id); // Cast int to long
    }


    // Create 
    public void storeProduct(Product product){
        Product result = productRepository.save(product);
        System.out.println("Product added succesfully" + result.getName());
    }


    // Update
    public void updateProduct(int id, Product product){
        product.setId(id);
        productRepository.save(product);
        
    }

    // Delete
    public void removeProduct(int id){
        productRepository.deleteById( (long) id);
    }

}
