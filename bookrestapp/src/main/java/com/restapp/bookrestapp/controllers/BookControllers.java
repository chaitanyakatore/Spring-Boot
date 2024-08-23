package com.restapp.bookrestapp.controllers;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapp.bookrestapp.entities.Book;
import com.restapp.bookrestapp.services.BooksService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class BookControllers {

    @Autowired
    private BooksService booksService;

   @GetMapping("/books")
    public List<Book> getBooks(){
        return booksService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id) {
        return booksService.getBookById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        //TODO: process POST request
        booksService.addBook(book);
        return book;
    }

    @DeleteMapping("/books/{bid}")
    public void deleteBook(@PathVariable ("bid") int bid){
        booksService.deleteBook(bid);
    }

    @PutMapping("books/{bid}")
    public Book putMethodName(@PathVariable("bid") int id, @RequestBody Book book) {
        booksService.updateBook(id, book);
        return book;
    }
    
    

}
