package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void listBooks() {
        System.out.println("✅ Listing books from BookService...");
        bookRepository.findAllBooks();
    }

    public void displayBookTitle() {
        System.out.println("📖 Book title is: 'Java Fundamentals'");
    }
}
