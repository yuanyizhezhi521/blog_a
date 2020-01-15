package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Comments;

public interface CommentsMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKeyWithBLOBs(Comments record);

    int updateByPrimaryKey(Comments record);
}