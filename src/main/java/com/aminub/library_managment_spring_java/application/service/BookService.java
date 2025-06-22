package com.aminub.library_managment_spring_java.application.service;

import com.aminub.library_managment_spring_java.domain.model.Book;
import com.aminub.library_managment_spring_java.domain.repository.BookRepository;
import com.aminub.library_managment_spring_java.domain.service.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookService implements IBookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book FindBookById(UUID Id) {
        return bookRepository.findById(Id)
                .orElseThrow(() -> new IllegalArgumentException("Book not found"));
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
