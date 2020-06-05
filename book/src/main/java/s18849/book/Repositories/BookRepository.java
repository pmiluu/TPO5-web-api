package s18849.book.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import s18849.book.Models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
