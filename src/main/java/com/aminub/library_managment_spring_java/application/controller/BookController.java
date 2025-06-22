package com.aminub.library_managment_spring_java.application.controller;

import com.aminub.library_managment_spring_java.application.service.BookService;
import com.aminub.library_managment_spring_java.domain.model.Book;
import com.aminub.library_managment_spring_java.domain.service.IBookService;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/api/book")
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);
    private final IBookService bookService;

    public BookController(IBookService iBookService) {
        this.bookService = iBookService;
    }

    /**
     * Retrives book by id
     *
     * @param Id the unique id for book
     * @return the book found
     */
    @GetMapping("/{Id}")
    public ResponseEntity<Book> getBook(
            @PathVariable UUID Id){
        log.info("Retreive book with Id : {}",Id);
        return ResponseEntity.ok(bookService.FindBookById(Id));
    }

    /**
     *
     * @param book
     * @return
     */
    @PostMapping
    public ResponseEntity<Book> addBook(
            @RequestBody Book book
    ){
        log.info("Adding new book with Id : {}",book);
        Book savedBook = bookService.save(book);
        return ResponseEntity.ok(savedBook);
    }

}
