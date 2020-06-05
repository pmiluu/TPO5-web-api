package s18849.book.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import s18849.book.Models.Book;
import s18849.book.Repositories.BookRepository;

@Component
public class DatabaseHandler {

    private BookRepository bookRepository;

    @Autowired
    public DatabaseHandler(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void create(){
        Book b1 = new Book("W pustyni i w puszczy", 201,"Przygodowa");
        bookRepository.save(b1);
        Book b2 = new Book("Pani Jeziora", 544,"Fantasy");
        bookRepository.save(b2);
        Book b3 = new Book("Droga królów", 1007,"Fantasy");
        bookRepository.save(b3);
        Book b4 = new Book("Krzyzacy", 533,"Historyczna");
        bookRepository.save(b4);
        Book b5 = new Book("Ogniem i mieczem", 755,"Historyczna");
        bookRepository.save(b5);
        Book b6 = new Book("Janko muzykant", 282,"Nowela");
        bookRepository.save(b6);
    }


}
