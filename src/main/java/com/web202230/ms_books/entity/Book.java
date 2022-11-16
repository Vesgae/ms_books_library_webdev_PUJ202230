package com.web202230.ms_books.entity;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String editorial;
    private String cover_url;
    private String description;
    private int publication_year;
    private int volume;

    public Book(){

    }

    public Book(Long id, String title, String editorial, String cover_url, String description, int publication_year, int volume){
        this.id = id;
        this.title = title;
        this.editorial = editorial;
        this.cover_url = cover_url;
        this.description = description;
        this.publication_year = publication_year;
        this.volume = volume;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCover_url() {
        return this.cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublication_year() {
        return this.publication_year;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    

    
    
}
