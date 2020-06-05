package s18849.book.Services;

import s18849.book.Models.Book;

import java.util.Optional;

public interface IBookService {
    Iterable<Book> findAll();
    void save(Book book);
    Optional<Book> findById(Long id);
    void delete(long id);
}
