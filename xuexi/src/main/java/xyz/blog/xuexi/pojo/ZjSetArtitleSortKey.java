package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class ZjSetArtitleSortKey implements Serializable {
    private Long articleId;

    private Long sortId;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }
}