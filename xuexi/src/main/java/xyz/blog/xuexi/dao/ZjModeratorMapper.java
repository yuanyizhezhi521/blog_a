package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjModerator;
import xyz.blog.xuexi.pojo.ZjModeratorKey;

public interface ZjModeratorMapper {
    int deleteByPrimaryKey(ZjModeratorKey key);

    int insert(ZjModerator record);

    int insertSelective(ZjModerator record);

    ZjModerator selectByPrimaryKey(ZjModeratorKey key);

    int updateByPrimaryKeySelective(ZjModerator record);

    int updateByPrimaryKey(ZjModerator record);
}