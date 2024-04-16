package pl.akademiaspecjalistowit.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiaspecjalistowit.demo.model.Book;
import pl.akademiaspecjalistowit.demo.service.BookService;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public Book getGreeting() {
        return bookService.getBook();
    }

    @GetMapping("/greeting2")
    public String getGreeting2() {
        return "hello2";
    }
}
