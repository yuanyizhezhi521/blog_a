package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjPosts;
import xyz.blog.xuexi.pojo.ZjPostsWithBLOBs;

public interface ZjPostsMapper {
    int deleteByPrimaryKey(Long postId);

    int insert(ZjPostsWithBLOBs record);

    int insertSelective(ZjPostsWithBLOBs record);

    ZjPostsWithBLOBs selectByPrimaryKey(Long postId);

    int updateByPrimaryKeySelective(ZjPostsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZjPostsWithBLOBs record);

    int updateByPrimaryKey(ZjPosts record);
}