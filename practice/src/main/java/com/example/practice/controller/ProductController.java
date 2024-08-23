package com.example.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.entities.Product;
import com.example.practice.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getProduct(@RequestParam("id") int id) {
         return productService.getProductById(id);
    }
    
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        productService.storeProduct(product);
    }
    
    @PutMapping("/products/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody Product uProduct) {
        productService.updateProduct(id, uProduct);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        productService.removeProduct(id);
    }
    

}
