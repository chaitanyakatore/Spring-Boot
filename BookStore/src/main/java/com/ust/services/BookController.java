package com.ust.services;

import java.util.List;
import java.util.Optional;

import com.ust.bean.Book;
import com.ust.repo.BookRepository;

public class BookController {
    private BookRepository repository = new BookRepository();

    // Handle GET request for all books
    public List<Book> getAllBooks() {
        List<Book> books = repository.getAllBooks();
        addHateoasLinks(books);
        return books;
    }

    // Handle GET request for a specific book
    public Optional<Book> getBookById(Long id) {
        Optional<Book> book = repository.getBookById(id);
        book.ifPresent(this::addHateoasLinks);
        return book;
    }

    // Handle POST request to add a new book
    public void addBook(Book book) {
        repository.addBook(book);
        addHateoasLinks(book);
    }

    // Handle PUT request to update a book
    public void updateBook(Book book) {
        repository.updateBook(book);
        addHateoasLinks(book);
    }

    // Handle DELETE request to delete a book
    public void deleteBook(Long id) {
        repository.deleteBook(id);
    }

    // Add HATEOAS links to a single book
    private void addHateoasLinks(Book book) {
        System.out.println("HATEOAS Links for Book ID: " + book.getId());
        System.out.println("Self Link: /books/" + book.getId());
        System.out.println("Update Link: /books/" + book.getId() + "/update");
        System.out.println("Delete Link: /books/" + book.getId() + "/delete");
    }

    // Add HATEOAS links to a list of books
    private void addHateoasLinks(List<Book> books) {
        books.forEach(this::addHateoasLinks);
    }
}
