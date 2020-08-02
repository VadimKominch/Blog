package by.kominch.blog.controller;

import by.kominch.blog.entity.Article;
import by.kominch.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RedirectToMainPostPageController {

    private ArticleRepository articleRepository;

    @Autowired
    public RedirectToMainPostPageController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping(value="/get_info")
    private String getPage(Model model) {
        Pageable page = PageRequest.of(0,15);
        List<Article> articleList = articleRepository.findAll(page).toList();
        model.addAttribute("posts",articleList);
        return "main";
    }
}
