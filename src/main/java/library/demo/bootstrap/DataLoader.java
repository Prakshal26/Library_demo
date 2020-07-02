package library.demo.bootstrap;

import library.demo.model.Book;
import library.demo.model.Owner;
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


        Owner owner1 = new Owner();
        owner1.setFirstName("Prakshal");
        owner1.setLastName("Jain");
        owner1.setPassword("12345678");


        Book book1 =new Book();
        book1.setBookName("ML Agarwal");
        book1.setPrice(500L);
        book1.setOwner(owner1);

        owner1.getBooks().add(book1);

        Book book2 = new Book();
        book2.setBookName("RS AGARWAL");
        book2.setPrice(500L);
        book2.setOwner(owner1);

        owner1.getBooks().add(book2);

        usersService.save(owner1);
        booksService.save(book1);
        booksService.save(book2);

        //Users userTest = books1.getUsers();
        //System.out.println(userTest.getFirstName());


       // Set<Books> bookstest ;
        //bookstest=users1.getBooks();

       // for(Books b: bookstest) {
         //   System.out.println(b.getBookName());
        //}


        Owner owner2 = new Owner();
        owner2.setFirstName("Ram");
        owner2.setLastName("Bharosey");
        owner2.setPassword("Jai Bholey");

        Book book3 = new Book();
        book3.setBookName("Dalal");
        book3.setPrice(50L);
        book3.setOwner(owner2);

        owner2.getBooks().add(book3);

        usersService.save(owner2);
        booksService.save(book3);
    }
}

