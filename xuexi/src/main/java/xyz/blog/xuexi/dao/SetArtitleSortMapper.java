package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.SetArtitleSortKey;

public interface SetArtitleSortMapper {
    int deleteByPrimaryKey(SetArtitleSortKey key);

    int insert(SetArtitleSortKey record);

    int insertSelective(SetArtitleSortKey record);
}