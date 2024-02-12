package com.bookcatalog.springboot.crudproject.controller;

import com.bookcatalog.springboot.crudproject.entity.Book;
import com.bookcatalog.springboot.crudproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;

    //Add a new book
    @PostMapping("/addBook")
    public Book saveBook(@RequestBody Book book){
        return service.addBook(book);
    }

    //Get all the books from DB
    @GetMapping("/getBooks")
    public List<Book> getAll(){
        return service.getAllBooks();
    }

    //Get a single book based on the ID
    @GetMapping("/getSingleBook")
    public Book getBook(@RequestParam int bookId){
        return service.getBookById(bookId);
    }

    //Edit the details of any book
    @PutMapping("/editBook")
    public Book updateBook(@RequestBody Book book){
        return service.editBook(book);
    }

    //Delete a book from the DB
    @DeleteMapping("deleteBook")
    public String deleteBook(@RequestParam int bookId){
        return service.removeBook(bookId);
    }
}
