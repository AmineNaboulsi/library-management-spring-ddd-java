package com.aminub.library_managment_spring_java.infractructure.controller;

import com.aminub.library_managment_spring_java.application.pyload.pagination.PageRequest;
import com.aminub.library_managment_spring_java.domain.model.Book;
import com.aminub.library_managment_spring_java.domain.service.IBookService;
import com.aminub.library_managment_spring_java.infractructure.dto.BookFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/api/book")
@CrossOrigin(origins = "*")
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

    /**
     *
     * @param filterPageRequest
     * @return
     */
    @PostMapping("/search")
    public ResponseEntity<Page<Book>> deleteBook(
        @RequestBody PageRequest<BookFilter> filterPageRequest
    ){
        return ResponseEntity.ok(bookService.search(filterPageRequest));
    }

}
