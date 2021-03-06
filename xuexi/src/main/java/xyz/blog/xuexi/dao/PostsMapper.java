package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Posts;
import xyz.blog.xuexi.pojo.PostsWithBLOBs;

public interface PostsMapper {
    int deleteByPrimaryKey(Long postId);

    int insert(PostsWithBLOBs record);

    int insertSelective(PostsWithBLOBs record);

    PostsWithBLOBs selectByPrimaryKey(Long postId);

    int updateByPrimaryKeySelective(PostsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostsWithBLOBs record);

    int updateByPrimaryKey(Posts record);
}