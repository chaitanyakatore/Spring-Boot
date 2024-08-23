package com.restapp.bookrestapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapp.bookrestapp.entities.Book;
import com.restapp.bookrestapp.repo.BookRepository;

@Service
public class BooksService {

    // #this below code is when we are not using the databaase
    // private List<Book> list;
    // // Constructor to initialize the list and add books
    // public BooksService() {
    //     list = new ArrayList<>();
    //     list.add(new Book(1, "Atomic Habits", "James Clear"));
    //     list.add(new Book(2, "The Alchemist", "Paulo Coelho"));
    // }

    @Autowired
    private BookRepository bookRepository;

    // Method to return the list of books
    public List<Book> getBooks() {
        List<Book> list = (List)bookRepository.findAll();
        return list;
    }

    // Method to get a book by ID
    public Book getBookById(int id) {
        // for (Book book : list) {
        //     if (book.getId() == id) {
        //         return book;
        //     }
        // }
        return bookRepository.findById(id);
    }

    // Method to add a new book to the list
    public Book addBook(Book book) {
        Book result = bookRepository.save(book);
        return result;
    }

    //Method to delete the book using id
    public void deleteBook(int id){
        //list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
        bookRepository.deleteById(id);
    }

    public void updateBook(int id, Book book){
        // list.stream().map(b->{
        //     if(b.getId() == id){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());
        book.setId(id);
        bookRepository.save(book);
    }

}
