package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjFriendLinks;

public interface ZjFriendLinksMapper {
    int deleteByPrimaryKey(Long friendLinkId);

    int insert(ZjFriendLinks record);

    int insertSelective(ZjFriendLinks record);

    ZjFriendLinks selectByPrimaryKey(Long friendLinkId);

    int updateByPrimaryKeySelective(ZjFriendLinks record);

    int updateByPrimaryKeyWithBLOBs(ZjFriendLinks record);

    int updateByPrimaryKey(ZjFriendLinks record);
}