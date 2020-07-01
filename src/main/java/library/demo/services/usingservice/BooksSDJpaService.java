package library.demo.services.usingservice;

import library.demo.command.BookCommand;
import library.demo.model.Books;
import library.demo.repositories.BooksRepository;
import library.demo.services.BooksService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springjpa")
public class BooksSDJpaService implements BooksService {

    private final BooksRepository booksRepository;

    public BooksSDJpaService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Set<Books> findAll() {

        Set<Books> books = new HashSet<>();
        booksRepository.findAll().forEach(books::add);

        return books;
    }

    @Override
    public Books findById(Long aLong) {
        Optional<Books> optionalOwner = booksRepository.findById(aLong);

        if(optionalOwner.isPresent()) {
            return optionalOwner.get();
        } else {
            return null;
        }
    }

    @Override
    public Books save(Books object) {
        return booksRepository.save(object);
    }

    @Override
    public void deleteByid(Long aLong) {

        booksRepository.deleteById(aLong);

    }

    @Override
    public void delete(Books object) {
        booksRepository.delete(object);

    }

    @Override
    public String Test() {
        return "TEST";
    }

    /*
    Similar to Bootstrap class where we were storing the book. Similarly
    we are getting data from user and here we have created one more book object and
    storing the data.
     */
    @Override
    public void saveBookCommand(BookCommand command) {

        Books newbook = new Books();
        newbook.setPrice(command.getPrice());
        newbook.setBookName(command.getBookName());

        booksRepository.save(newbook);
    }
}
