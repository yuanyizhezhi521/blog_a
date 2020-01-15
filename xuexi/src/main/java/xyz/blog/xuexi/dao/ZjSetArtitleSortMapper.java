package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjSetArtitleSortKey;

public interface ZjSetArtitleSortMapper {
    int deleteByPrimaryKey(ZjSetArtitleSortKey key);

    int insert(ZjSetArtitleSortKey record);

    int insertSelective(ZjSetArtitleSortKey record);
}