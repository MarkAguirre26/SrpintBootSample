package Controller;

import Model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {


    @Autowired
    private ArticleService articleService;


    @RequestMapping("/articles")
    public List<Article> getAllArticle() {
        return articleService.getArticleList();
    }

    @RequestMapping("/articles/{id}")
    public Article getArticle(@PathVariable  String id) {
        return articleService.getAriticle(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "articles")
    public  void addArticle(@RequestBody Article article){
articleService.addArticle(article);
    }
}
