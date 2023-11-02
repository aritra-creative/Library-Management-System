package com.project.library_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookId")
    private int id;
    @Column(name = "BookName")
    private String name;
    private String author;
    private int isbn;
    private String publicationDate;
    private String publisher;
    private int copies;
    private String category;
    private String genre;
    public String subcategory;
}
