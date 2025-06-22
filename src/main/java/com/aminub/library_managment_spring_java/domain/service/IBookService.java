package com.aminub.library_managment_spring_java.domain.service;

import com.aminub.library_managment_spring_java.domain.model.Book;

import java.util.UUID;

/**
 *
 */
public interface IBookService {
    Book FindBookById(UUID Id);
}
