package s18849.book.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import s18849.book.Models.Book;
import s18849.book.Repositories.BookRepository;

import java.util.Optional;

@Service
public class MyBookService implements IBookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void delete(long id) {
        bookRepository.deleteById(id);
    }
}
