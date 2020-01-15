package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class ZjFriendLinks implements Serializable {
    private Long friendLinkId;

    private String friendLinks;

    private String friendLinkName;

    private String friendLinkLogo;

    private String friendLinkDescription;

    private static final long serialVersionUID = 1L;

    public Long getFriendLinkId() {
        return friendLinkId;
    }

    public void setFriendLinkId(Long friendLinkId) {
        this.friendLinkId = friendLinkId;
    }

    public String getFriendLinks() {
        return friendLinks;
    }

    public void setFriendLinks(String friendLinks) {
        this.friendLinks = friendLinks;
    }

    public String getFriendLinkName() {
        return friendLinkName;
    }

    public void setFriendLinkName(String friendLinkName) {
        this.friendLinkName = friendLinkName;
    }

    public String getFriendLinkLogo() {
        return friendLinkLogo;
    }

    public void setFriendLinkLogo(String friendLinkLogo) {
        this.friendLinkLogo = friendLinkLogo;
    }

    public String getFriendLinkDescription() {
        return friendLinkDescription;
    }

    public void setFriendLinkDescription(String friendLinkDescription) {
        this.friendLinkDescription = friendLinkDescription;
    }
}