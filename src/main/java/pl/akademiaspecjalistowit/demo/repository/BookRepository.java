package pl.akademiaspecjalistowit.demo.repository;

import java.util.Map;
import org.springframework.stereotype.Repository;
import pl.akademiaspecjalistowit.demo.model.Book;

@Repository
public class BookRepository {

    private final Map<String, Book> books;

    public BookRepository() {
        this.books = Map.of("a", new Book("książka a"));
    }

    public Book getBook() {
        return books.get("a");
    }
}
