package library.demo.controller;

import library.demo.services.BooksService;
import library.demo.services.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {


    private final BooksService booksService;

    public BookController(BooksService booksService) {
        this.booksService = booksService;
    }
/*
We are passing user id from user.html. We will display only that book which is associated with the
passsed user id.
 */
    @RequestMapping("/Book/{id}")
    public String test(@PathVariable String id, Model model) {

        model.addAttribute("test",booksService.Test());
        model.addAttribute("books",booksService.findById(Long.valueOf(id)));
       return "Book";
    }

    @RequestMapping("/Book/new")
    public String addBook(Model model) {
        model.addAttribute("book",new BookCommand());
        return "Form";
    }
}
