package pl.coderslab;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Component
@Service
public class MockBookService implements BookService{

    private List<Book> books;
    public MockBookService() {
        books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce	Eckel", "Helion", "programming"));
        books.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        books.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Optional<Book> get(Long id) {
        return Optional.empty();
    }

    @Override
    public void add(Book book) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Book book) {

    }
}
