package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjUsers;

public interface ZjUsersMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(ZjUsers record);

    int insertSelective(ZjUsers record);

    ZjUsers selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(ZjUsers record);

    int updateByPrimaryKey(ZjUsers record);
}