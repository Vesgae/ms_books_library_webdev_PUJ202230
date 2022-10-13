package com.web202230.ms_books.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.web202230.ms_books.entity.Book;
import com.web202230.ms_books.repository.BookRepository;

@Service
@Transactional
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
    public Optional<Book> getBook(Long id){
        return bookRepository.findById(id);

    }
    public boolean existsByIdBook(Long id){
        return bookRepository.existsById(id);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    public void saveBook(Book book){
        bookRepository.save(book);

    }
}
