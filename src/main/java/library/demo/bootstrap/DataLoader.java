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

        Books books1 =new Books();
        books1.setBookName("ML Agarwal");
        books1.setPrice(500L);


        Users users1 = new Users();
        users1.setFirstName("Prakshal");
        users1.setLastName("Jain");
        users1.setPassword("12345678");

        books1.setUsers(users1);

        users1.getBooks().add(books1);

        //booksService.save(books1);
        usersService.save(users1);

        Books books2 = new Books();
        books2.setBookName("RS AGARWAL");
        books2.setPrice(500L);
        booksService.save(books2);

        Users users2 = new Users();
        users2.setFirstName("Ram");
        users2.setLastName("Bharosey");
        users2.setPassword("Jai Bholey");
        users2.getBooks().add(books2);


        Books books3 = new Books();
        books3.setBookName("Dalal");
        books3.setPrice(50L);
        booksService.save(books3);

        users2.getBooks().add(books3);

        usersService.save(users2);
    }
}

