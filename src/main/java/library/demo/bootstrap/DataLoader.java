package library.demo.bootstrap;

import library.demo.model.Books;
import library.demo.model.Users;
import library.demo.services.BooksService;
import library.demo.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BooksService booksService;
    private final UsersService usersService;


    @Autowired
    public DataLoader(BooksService booksService, UsersService usersService) {
        this.booksService = booksService;
        this.usersService = usersService;
    }


    @Override
    public void run(String... args) throws Exception {

        Books books =new Books();
        books.setBookName("ML");
        books.setPrice(100L);

        booksService.save(books);

        Users users = new Users();
        users.setFirstName("Prakshal");
        users.setLastName("Jain");
        users.setPassword("12345678");
     //   users.setBooks(books);

        usersService.save(users);


    }
}

