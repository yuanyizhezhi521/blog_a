package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class Moderator extends ModeratorKey implements Serializable {
    private String moderatorLevel;

    private static final long serialVersionUID = 1L;

    public String getModeratorLevel() {
        return moderatorLevel;
    }

    public void setModeratorLevel(String moderatorLevel) {
        this.moderatorLevel = moderatorLevel;
    }
}