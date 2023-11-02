package com.project.library_management_system.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookModel {
    private int id;
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
