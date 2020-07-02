package library.demo.services.map;

import library.demo.command.BookCommand;
import library.demo.model.Book;
import library.demo.services.BooksService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("default")
public class BooksMapService extends AbstractService<Book,Long> implements BooksService {

    @Override
    public Set<Book> findAll() {
        return super.findAll();
    }

    @Override
    public Book save(Book object) {
        return super.save(object);
    }

    @Override
    public Book findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteByid(Long aLong) {
        super.deleteByid(aLong);
    }

    @Override
    public void delete(Book object) {
        super.delete(object);
    }

    @Override
    public void saveBookCommand(BookCommand command) {

    }

    @Override
    public String Test() {
       return super.Test();
    }
}
