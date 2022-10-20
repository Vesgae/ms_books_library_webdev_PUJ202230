package com.web202230.ms_books.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.web202230.ms_books.entity.Book;
import com.web202230.ms_books.service.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getbooks")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> Books = bookService.getBooks();
        return new ResponseEntity<List<Book>>(Books, HttpStatus.OK);
    }
}
