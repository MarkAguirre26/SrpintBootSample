package Controller;

import Model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {

    List<Article> articleList  = new ArrayList<Article>(Arrays.asList(
            new Article("1","Jena","Mathy"),
            new Article("2","Kim","Hoku"),
            new Article("3","Tin","Li")
    ));

    public  List<Article> getArticleList(){
        return  articleList;
    }

    public  Article getAriticle(String id){
        return articleList.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addArticle(Article article) {

        articleList.add(article);
    }
}
