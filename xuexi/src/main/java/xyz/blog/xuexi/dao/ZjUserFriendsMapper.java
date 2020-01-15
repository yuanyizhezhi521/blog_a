package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjUserFriends;

public interface ZjUserFriendsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ZjUserFriends record);

    int insertSelective(ZjUserFriends record);

    ZjUserFriends selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ZjUserFriends record);

    int updateByPrimaryKey(ZjUserFriends record);
}