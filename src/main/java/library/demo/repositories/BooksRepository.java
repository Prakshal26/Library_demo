package library.demo.repositories;

import library.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Book,Long> {
}
