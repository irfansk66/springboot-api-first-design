package com.lib.springbootapifirstdesign.controller;

import com.lib.springbootapifirstdesign.api.LibraryApi;
import com.lib.springbootapifirstdesign.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {
    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {

        List<Book> books = new ArrayList<>();
        Book book = new Book();
        book.setName("Harry Potter");
        book.setBookAuthor("JK Rowling");

        Book book2 = new Book();
        book2.setName("Quantum Physics");
        book2.setBookAuthor("Steven Holzner");
        books.add(book);books.add(book2);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
