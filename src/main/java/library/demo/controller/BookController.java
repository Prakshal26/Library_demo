package library.demo.controller;

import library.demo.services.BooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {


    private final BooksService booksService;

    public BookController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping({"","/","index","book","index.html"})
    public String test(Model model) {
        model.addAttribute("test",booksService.Test());
        model.addAttribute("books",booksService.findAll());
       return "Book";
    }
}
