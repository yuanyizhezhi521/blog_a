package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjForums;

public interface ZjForumsMapper {
    int deleteByPrimaryKey(Long forumId);

    int insert(ZjForums record);

    int insertSelective(ZjForums record);

    ZjForums selectByPrimaryKey(Long forumId);

    int updateByPrimaryKeySelective(ZjForums record);

    int updateByPrimaryKeyWithBLOBs(ZjForums record);

    int updateByPrimaryKey(ZjForums record);
}