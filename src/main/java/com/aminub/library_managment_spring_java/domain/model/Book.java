package com.aminub.library_managment_spring_java.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Book {
    @Id
    private UUID id;
    private String name;
    private String isbn;

    public Book(String name, String isbn) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.isbn = isbn;
    }
}
