package library.demo.services;

import library.demo.command.BookCommand;
import library.demo.model.Books;

import java.util.Set;

public interface BooksService extends CurdService<Books,Long> {

    @Override
    Set<Books> findAll();

    @Override
    Books findById(Long aLong);

    @Override
    Books save(Books object);

    @Override
    void deleteByid(Long aLong);

    @Override
    void delete(Books object);

    void saveBookCommand(BookCommand command);

    @Override
    String Test();
}
