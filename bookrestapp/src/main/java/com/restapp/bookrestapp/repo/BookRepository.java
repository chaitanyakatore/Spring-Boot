package com.restapp.bookrestapp.repo;

import org.springframework.data.repository.CrudRepository;
import com.restapp.bookrestapp.entities.Book;



public interface BookRepository extends CrudRepository<Book,Integer> {
    
    public Book findById(int id);
}
