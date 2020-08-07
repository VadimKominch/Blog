package by.kominch.blog.controller;


import by.kominch.blog.repository.UserRepository;
import by.kominch.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    private UserService service;
    private UserRepository userRepository;

    @Autowired
    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/get_register")
    public String getPage() {
        return "register";
    }
}
