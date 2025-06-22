package com.aminub.library_managment_spring_java.domain.repository;

import com.aminub.library_managment_spring_java.domain.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
}
