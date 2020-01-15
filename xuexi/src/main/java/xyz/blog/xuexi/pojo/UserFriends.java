package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class UserFriends implements Serializable {
    private Long id;

    private Long userId;

    private Long userFriendsId;

    private String userNote;

    private String userStatus;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserFriendsId() {
        return userFriendsId;
    }

    public void setUserFriendsId(Long userFriendsId) {
        this.userFriendsId = userFriendsId;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}