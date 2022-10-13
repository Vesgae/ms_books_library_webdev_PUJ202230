package com.web202230.ms_books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web202230.ms_books.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
