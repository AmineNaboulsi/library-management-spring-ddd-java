package com.aminub.library_managment_spring_java.domain.service;

import com.aminub.library_managment_spring_java.application.pyload.pagination.PageRequest;
import com.aminub.library_managment_spring_java.domain.model.Book;
import com.aminub.library_managment_spring_java.infractructure.dto.BookFilter;
import org.springframework.data.domain.Page;

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

    /**
     *
     * @param filterPageRequest
     * @return
     */
    Page<Book> search(PageRequest<BookFilter> filterPageRequest);
}
