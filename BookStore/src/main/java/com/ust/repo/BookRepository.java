package com.ust.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.ust.bean.Book;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    // Create
    public void addBook(Book book) {
        books.add(book);
    }

    // Read
    public Optional<Book> getBookById(Long id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst();
    }

    public List<Book> getAllBooks() {
        return books;
    }

    // Update
    public void updateBook(Book updatedBook) {
        getBookById(updatedBook.getId()).ifPresent(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
        });
    }

    // Delete
    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
