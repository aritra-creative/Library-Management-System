package com.project.library_management_system.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.library_management_system.entity.Author;
import com.project.library_management_system.models.AuthorModel;
import com.project.library_management_system.repositary.AuthorRepositary;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepositary authorRepositary;

    public AuthorModel createAuthor(AuthorModel authorModel) {
        Author author = new Author();
        BeanUtils.copyProperties(authorModel, author);
        authorRepositary.save(author);
        return authorModel;
    }

    public List<AuthorModel> getAllAuthors() {
        List<Author> authors = authorRepositary.findAll();

        List<AuthorModel> authorModels = authors.stream()
                .map(auth -> new AuthorModel(
                        auth.getId(),
                        auth.getName(),
                        auth.getNationality(),
                        auth.getEmail()))
                .collect(Collectors.toList());
        return authorModels;
    }

    public boolean deleteAuthor(int id) {
        Author author = authorRepositary.findById(id).get();
        authorRepositary.delete(author);
        return true;

    }

    public AuthorModel getAuthorById(int id) {
        Author author = authorRepositary.findById(id).get();
        AuthorModel authorModel = new AuthorModel();
        BeanUtils.copyProperties(author, authorModel);
        return authorModel;
    }
}
