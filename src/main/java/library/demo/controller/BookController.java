package library.demo.controller;

import library.demo.command.BookCommand;
import library.demo.services.BooksService;
import library.demo.services.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.ManyToOne;

@Controller
public class BookController {


    private final BooksService booksService;

    public BookController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping("/Book")
    public String displayAllBooks(Model model) {
        model.addAttribute("books",booksService.findAll());

        return "Book";
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

    /*
    This is related to Form. Form.html will respond to it. We can see we have given book in form.html
    and in form feild we are giving book attributes by *{price} so when ever user will enter data there
    it will be stored there and wehn he will click submit it will go to post i.e in book.
     */
    @RequestMapping("/Book/new")
    public String addBook(Model model) {
        model.addAttribute("book",new BookCommand());
        return "Form";
    }
/*
As user has entered the data and present in *{price} so here we will get that model
and store the books.
 */
    @PostMapping("book")
    public String saveBook (@ModelAttribute BookCommand bookCommand) {

        booksService.saveBookCommand(bookCommand);
    /*
    After the data is stored redirect the user to this page where he can see the list of books.
     */
        return "redirect:/Book";
    }
}
