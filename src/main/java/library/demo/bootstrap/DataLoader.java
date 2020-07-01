package library.demo.bootstrap;

import library.demo.model.Books;
import library.demo.model.Users;
import library.demo.services.BooksService;
import library.demo.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;
import java.util.HashSet;
import java.util.Set;

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


        Users users1 = new Users();
        users1.setFirstName("Prakshal");
        users1.setLastName("Jain");
        users1.setPassword("12345678");


        Books books1 =new Books();
        books1.setBookName("ML Agarwal");
        books1.setPrice(500L);
        books1.setUsers(users1);

        users1.getBooks().add(books1);

        Books books2 = new Books();
        books2.setBookName("RS AGARWAL");
        books2.setPrice(500L);
        books2.setUsers(users1);

        users1.getBooks().add(books2);

        usersService.save(users1);
        booksService.save(books1);
        booksService.save(books2);

        //Users userTest = books1.getUsers();
        //System.out.println(userTest.getFirstName());


       // Set<Books> bookstest ;
        //bookstest=users1.getBooks();

       // for(Books b: bookstest) {
         //   System.out.println(b.getBookName());
        //}


        Users users2 = new Users();
        users2.setFirstName("Ram");
        users2.setLastName("Bharosey");
        users2.setPassword("Jai Bholey");

        Books books3 = new Books();
        books3.setBookName("Dalal");
        books3.setPrice(50L);
        books3.setUsers(users2);

        users2.getBooks().add(books3);

        usersService.save(users2);
        booksService.save(books3);
    }
}

