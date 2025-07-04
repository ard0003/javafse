package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        // Call method 1
        bookService.listBooks();           // e.g., shows "Listing books..."
        
        // Call method 2
        bookService.displayBookTitle();    // e.g., shows "Book title is..."
    }
}
