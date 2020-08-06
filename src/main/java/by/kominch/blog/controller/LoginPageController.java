package by.kominch.blog.controller;

import by.kominch.blog.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {

    @RequestMapping(value = "/login_page")
    public String getPage() {
        return "login";
    }
}
