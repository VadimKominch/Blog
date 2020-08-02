package by.kominch.blog.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String articleName;


    private String articleText;

    @Column(name="article_name")
    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    @Column(name="article_text")
    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", articleName='" + articleName + '\'' +
                ", articleText='" + articleText + '\'' +
                '}';
    }
}
