package com.bookcatalog.springboot.crudproject.service;


import com.bookcatalog.springboot.crudproject.controller.BookController;
import com.bookcatalog.springboot.crudproject.entity.Book;
import com.bookcatalog.springboot.crudproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService{


    @Autowired
    private BookRepository repository;

    // Method to add a new book to the repository
    public Book addBook(Book book) {
        return repository.save(book);
    }

    // Method to retrieve a list of all books from the repository
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    // Method to get a book by its unique identifier (bookId) from the repository
    public Book getBookById(int bookId) {
        // Attempt to find the book by its ID in the repository
        Optional<Book> optionalBook = repository.findById(bookId);
        Book searchedBook = null;
        if(optionalBook.isPresent()){
            searchedBook = optionalBook.get();
        } else{
            // Check if the book with the given ID exists
            throw new RuntimeException("Book with Id " + bookId + "not found!");

        }

       return searchedBook;
    }

    // Method to edit/update an existing book in the repository
    public Book editBook(Book book) { //update api
        // Retrieve the existing book by its ID
        Book existingBook = repository.getReferenceById(book.getBookId());
        // Update the fields of the existing book with the values from the provided book
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setGenre(book.getGenre());
        existingBook.setSummary(book.getSummary());
        existingBook.setYearOfPublication(book.getYearOfPublication());

        // Save the updated book to the repository
        return repository.save(existingBook);
    }

    // Method to remove/delete a book by its ID from the repository
    public String removeBook(int bookId) {
        // Delete the book with the specified ID from the repository
       repository.deleteById(bookId);

        // Return a success message indicating that the book was deleted successfully
       return "Book " + bookId + " deleted successfully";
    }
}
