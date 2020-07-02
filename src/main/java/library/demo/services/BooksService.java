package library.demo.services;

import library.demo.command.BookCommand;
import library.demo.model.Book;

import java.util.Set;

public interface BooksService extends CurdService<Book,Long> {

    @Override
    Set<Book> findAll();

    @Override
    Book findById(Long aLong);

    @Override
    Book save(Book object);

    @Override
    void deleteByid(Long aLong);

    @Override
    void delete(Book object);

    void saveBookCommand(BookCommand command);

    @Override
    String Test();
}
