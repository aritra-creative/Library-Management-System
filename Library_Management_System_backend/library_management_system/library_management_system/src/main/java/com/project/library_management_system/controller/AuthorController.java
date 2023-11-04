package com.project.library_management_system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.project.library_management_system.models.AuthorModel;
import com.project.library_management_system.service.AuthorService;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @PostMapping("/author")
    public AuthorModel createAuthor(@RequestBody AuthorModel authorModel) {
        return authorService.createAuthor(authorModel);
    }

    @GetMapping("/authors")
    public List<AuthorModel> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/author/{id}")
    public AuthorModel getAuthorById(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    @DeleteMapping("/author/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteAuthor(@PathVariable int id) {
        boolean deleted = false;
        deleted = authorService.deleteAuthor(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
}
