package com.project.library_management_system.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library_management_system.entity.Book;

@Repository
public interface BookRepositary extends JpaRepository<Book, Integer> {

}
