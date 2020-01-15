package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjComments;

public interface ZjCommentsMapper {
    int deleteByPrimaryKey(Long commentId);

    int insert(ZjComments record);

    int insertSelective(ZjComments record);

    ZjComments selectByPrimaryKey(Long commentId);

    int updateByPrimaryKeySelective(ZjComments record);

    int updateByPrimaryKeyWithBLOBs(ZjComments record);

    int updateByPrimaryKey(ZjComments record);
}