package library.demo.dataloader;

import library.demo.model.Books;
import library.demo.services.BooksService;
import library.demo.services.map.BooksMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final BooksService booksService;

    public BootStrap(BooksService booksService) {
        this.booksService = booksService;
    }

    @Override
    public void run(String... args) throws Exception {

        Books books =new Books();
        books.setBookName("ML");
        books.setPrice(100L);

        booksService.save(books);

    }
}

