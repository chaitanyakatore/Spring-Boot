package com.ust;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.bean.Book;
import com.ust.services.BookController;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx  = SpringApplication.run(BookStoreApplication.class, args);
		
		
		BookController controller = ctx.getBean(BookController.class);

        // Create a new book and add it to the repository using POST
        Book book1 = new Book(1L, "The Great Gatsby", "F. Scott Fitzgerald");
        controller.addBook(book1);
        System.out.println("Book Added:\n" + book1);

        // Retrieve the added book using GET and print the details
        System.out.println("\nRetrieving Book:\n" + controller.getBookById(1L).orElseThrow());

        // Update the book's information using PUT
        book1.setAuthor("F. Scott Fitzgerald (Updated)");
        controller.updateBook(book1);
        System.out.println("\nBook Updated:\n" + controller.getBookById(1L).orElseThrow());

        // Delete the book using DELETE
        controller.deleteBook(1L);
        System.out.println("\nBook Deleted Successfully");

        // Try to retrieve the deleted book and handle the response appropriately
        System.out.println("\nAttempting to Retrieve Deleted Book:");
        Optional<Book> deletedBook = controller.getBookById(1L);
        if (deletedBook.isEmpty()) {
            System.out.println("Book Not Found");
        }
  
	}

}
