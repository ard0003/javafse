package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String libraryName;

    // Constructor for mandatory dependency
    public BookService(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("Constructor Injection: Library Name is " + libraryName);
    }

    // Setter for optional dependency
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository set");
    }

    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        if (bookRepository != null) {
            bookRepository.printBooks();
        } else {
            System.out.println("BookRepository is not initialized.");
        }
    }
}
