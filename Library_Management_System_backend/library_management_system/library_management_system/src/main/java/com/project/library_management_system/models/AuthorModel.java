package com.project.library_management_system.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorModel {
    private int id;
    private String name;
    private String nationality;
    private String email;
}
