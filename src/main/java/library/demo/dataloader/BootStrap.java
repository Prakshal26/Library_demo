package library.demo.dataloader;

import library.demo.model.Books;
import library.demo.model.Users;
import library.demo.services.BooksService;
import library.demo.services.UsersService;
import library.demo.services.map.BooksMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final BooksService booksService;
    private final UsersService usersService;


    public BootStrap(BooksService booksService, UsersService usersService) {
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
        users.setBooks(books);

        usersService.save(users);

        Users users1 = usersService.findById(1L);
        System.out.println(users1.getFirstName());
        System.out.println(users1.getBooks().getBookName());

        Books bookk = booksService.findById(1L);
        System.out.println(bookk.getBookName());

    }
}

