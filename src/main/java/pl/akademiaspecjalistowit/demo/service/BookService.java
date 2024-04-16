package pl.akademiaspecjalistowit.demo.service;

import org.springframework.stereotype.Service;
import pl.akademiaspecjalistowit.demo.model.Book;
import pl.akademiaspecjalistowit.demo.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBook(){
        return bookRepository.getBook();
    }
}
