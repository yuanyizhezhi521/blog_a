package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.FriendLinks;

public interface FriendLinksMapper {
    int deleteByPrimaryKey(Long friendLinkId);

    int insert(FriendLinks record);

    int insertSelective(FriendLinks record);

    FriendLinks selectByPrimaryKey(Long friendLinkId);

    int updateByPrimaryKeySelective(FriendLinks record);

    int updateByPrimaryKeyWithBLOBs(FriendLinks record);

    int updateByPrimaryKey(FriendLinks record);
}