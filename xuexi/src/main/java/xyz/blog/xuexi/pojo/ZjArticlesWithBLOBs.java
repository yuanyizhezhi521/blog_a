package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class ZjArticlesWithBLOBs extends ZjArticles implements Serializable {
    private String articleTitle;

    private String articleContent;

    private static final long serialVersionUID = 1L;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}