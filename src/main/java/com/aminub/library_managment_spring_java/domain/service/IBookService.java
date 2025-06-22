package com.aminub.library_managment_spring_java.domain.service;

import com.aminub.library_managment_spring_java.domain.model.Book;

import java.util.UUID;

/**
 *
 */
public interface IBookService {

    /**
     *
     * @param Id
     * @return
     */
    Book FindBookById(UUID Id);

    /**
     *
     * @param book
     * @return
     */
    Book save(Book book);
}
