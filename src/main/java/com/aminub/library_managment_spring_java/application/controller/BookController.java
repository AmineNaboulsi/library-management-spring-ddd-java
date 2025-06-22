package com.aminub.library_managment_spring_java.application.controller;

import com.aminub.library_managment_spring_java.application.service.BookService;
import com.aminub.library_managment_spring_java.domain.model.Book;
import com.aminub.library_managment_spring_java.domain.service.IBookService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/api/book")
public class BookController {

    private final IBookService iBookService;

    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    /**
     * Retrives book by id
     *
     * @param Id the unique id for book
     * @return the book found
     */
    @GetMapping("/{Id}")
    public ResponseEntity<Book> getBook(
            @PathVariable String Id){
        System.out.println("call getBook method");
        return ResponseEntity.ok(iBookService.FindBookById(UUID.fromString(Id)));
    }

}
