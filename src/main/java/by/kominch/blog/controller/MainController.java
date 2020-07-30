package by.kominch.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"", "/", "index"})
public class MainController {

    public String getMainPage() {
        return "index";
    }
}
