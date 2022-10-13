package com.web202230.ms_books.entity;

import javax.persistence.*;

@Entity
@Table(name="libros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String editorial;
    private String portada;
    private String prologo;
    private int fecha_edicion;
    private int cantidad;

    public Book(String nombre, String editorial, String portada, String prologo, int fecha_edicion, int cantidad) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.portada = portada;
        this.prologo = prologo;
        this.fecha_edicion = fecha_edicion;
        this.cantidad = cantidad;
    }

    public Book() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getPrologo() {
        return prologo;
    }

    public void setPrologo(String prologo) {
        this.prologo = prologo;
    }

    public int getFecha_edicion() {
        return fecha_edicion;
    }

    public void setFecha_edicion(int fecha_edicion) {
        this.fecha_edicion = fecha_edicion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    
    
}
