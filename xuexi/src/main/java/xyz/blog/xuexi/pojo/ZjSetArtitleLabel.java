package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class ZjSetArtitleLabel implements Serializable {
    private Long articleId;

    private Long labelId;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getLabelId() {
        return labelId;
    }

    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }
}