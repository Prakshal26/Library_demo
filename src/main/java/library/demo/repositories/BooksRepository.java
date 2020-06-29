package library.demo.repositories;

import library.demo.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Long> {
}
