package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjMenus;

public interface ZjMenusMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(ZjMenus record);

    int insertSelective(ZjMenus record);

    ZjMenus selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(ZjMenus record);

    int updateByPrimaryKey(ZjMenus record);
}