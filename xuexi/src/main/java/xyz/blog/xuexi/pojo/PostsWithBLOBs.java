package xyz.blog.xuexi.pojo;

import java.io.Serializable;

public class PostsWithBLOBs extends Posts implements Serializable {
    private String postTitle;

    private String postContent;

    private static final long serialVersionUID = 1L;

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
}