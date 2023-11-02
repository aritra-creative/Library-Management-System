package com.project.library_management_system.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library_management_system.entity.Author;

@Repository
public interface AuthorRepositary extends JpaRepository<Author, Integer> {

}
