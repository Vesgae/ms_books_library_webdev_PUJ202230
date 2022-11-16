package com.web202230.ms_books.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.web202230.ms_books.entity.Book;
import com.web202230.ms_books.service.BookService;

@RestController
@RequestMapping("")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getbooks")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> Books = bookService.getBooks();
        return new ResponseEntity<List<Book>>(Books, HttpStatus.OK);
    }


    @GetMapping("/getbooksByEditorial/{editorial}/")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Book>> getBooksByEditorial(@PathVariable String editorial){
                return new ResponseEntity<List<Book>>(getListBookByEditorial(editorial), HttpStatus.OK);
    }

 
    private List<Book> getAllBooks() {
        return bookService.getBooks();
    }

    private List<Book> getListBookByEditorial(String editorial) {
        List<Book> books = getAllBooks();
        List<Book> newbooks = books;
        for(Book book: newbooks){
            if(!book.getEditorial().equals(editorial))
                newbooks.remove(book);
        }
        return newbooks;
    }
/* 
    private Long getBookId(String email){
        List<User> users = getAllUsers();
        for(User user: users){
            if(user.getEmail().equals(email))
                return (long) users.indexOf(user);
        }
        return (long) -1;

    } */
}
