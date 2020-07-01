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

    /*
    Whenever user will type localhost:8080/book in browser this request mapping will be called.
    And in this function we are returning to Book so it will call Book.html page whenever someone
    types the url as /book.
     */
    @RequestMapping("/book")
    public String displayAllBooks(Model model) {
        /*
    In html file it will fetch/return data to this mapping "books".
    Means whereever there is books in html it will call this function.
    Or whereever in html it needs data related to books it will take from this function.
     */
        model.addAttribute("books",booksService.findAll());
//It will call return to the page Book.html
        return "Book";
    }
/*
We are passing user id from user.html. We will display only that book which is associated with the
passsed user id.
 */
    @RequestMapping("/book/{id}")
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
    @RequestMapping("/book/new")
    public String addBook(Model model) {
        model.addAttribute("book",new BookCommand());
        return "Form";
    }
/*
On SUbmitting the form we will be re-directed here.
As user has entered the data and present in *{price} so here we will get that model
and store the books.
 */
    @PostMapping("book")
    public String saveBook (@ModelAttribute BookCommand bookCommand) {

        booksService.saveBookCommand(bookCommand);
    /*
    After the data is stored redirect the user to this page where he can see the list of books.
     */
        return "redirect:/book";
    }

    @RequestMapping("book/{id}/delete")
    public String deleteBook(@PathVariable String id) {

        booksService.deleteByid(Long.valueOf(id));
        return "redirect:/book";
    }

    @RequestMapping("book/{id}/update")
    public String updateBook(@PathVariable String id, Model model) {

        model.addAttribute("book",booksService.findById(Long.valueOf(id)));
        return "Form";
    }
}
