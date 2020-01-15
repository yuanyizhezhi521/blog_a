package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class ModeratorKey implements Serializable {
    private Long moderatorId;

    private Long forumId;

    private static final long serialVersionUID = 1L;

    public Long getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(Long moderatorId) {
        this.moderatorId = moderatorId;
    }

    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }
}