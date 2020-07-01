package library.demo.controller;

import library.demo.services.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

   private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }
    @RequestMapping({"","/","index","/users","/user.html"})
    public String getUsers(Model model) {
        model.addAttribute("users",usersService.findAll());
        return "User";
    }
}
