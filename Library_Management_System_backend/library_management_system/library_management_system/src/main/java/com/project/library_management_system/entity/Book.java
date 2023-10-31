package com.project.library_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Table")
public class Book {
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
