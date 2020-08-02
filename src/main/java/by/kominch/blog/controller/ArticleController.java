package by.kominch.blog.controller;


import by.kominch.blog.entity.Article;
import by.kominch.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/article")
public class ArticleController {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping(value = {"/",""})
    public String getPage(Model model) {
        Article article = new Article();
        model.addAttribute("article",article);
        return "article";
    }

    @PostMapping(value = "/add")
    public String addArticle(@ModelAttribute Article article) {
        articleRepository.save(article);
        System.out.println("SAVED!!!!!!!!!!!!");
        return "redirect:/get_info";
    }

}
