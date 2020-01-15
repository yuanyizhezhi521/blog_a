package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Moderator;
import xyz.blog.xuexi.pojo.ModeratorKey;

public interface ModeratorMapper {
    int deleteByPrimaryKey(ModeratorKey key);

    int insert(Moderator record);

    int insertSelective(Moderator record);

    Moderator selectByPrimaryKey(ModeratorKey key);

    int updateByPrimaryKeySelective(Moderator record);

    int updateByPrimaryKey(Moderator record);
}