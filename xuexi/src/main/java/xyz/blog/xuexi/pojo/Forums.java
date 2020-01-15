package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class Forums implements Serializable {
    private Long forumId;

    private String forumName;

    private String forumLogo;

    private Long forumPostCount;

    private Long parentForumId;

    private String forumDescription;

    private static final long serialVersionUID = 1L;

    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

    public String getForumName() {
        return forumName;
    }

    public void setForumName(String forumName) {
        this.forumName = forumName;
    }

    public String getForumLogo() {
        return forumLogo;
    }

    public void setForumLogo(String forumLogo) {
        this.forumLogo = forumLogo;
    }

    public Long getForumPostCount() {
        return forumPostCount;
    }

    public void setForumPostCount(Long forumPostCount) {
        this.forumPostCount = forumPostCount;
    }

    public Long getParentForumId() {
        return parentForumId;
    }

    public void setParentForumId(Long parentForumId) {
        this.parentForumId = parentForumId;
    }

    public String getForumDescription() {
        return forumDescription;
    }

    public void setForumDescription(String forumDescription) {
        this.forumDescription = forumDescription;
    }
}