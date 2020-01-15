package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Menus;

public interface MenusMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(Menus record);

    int insertSelective(Menus record);

    Menus selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(Menus record);

    int updateByPrimaryKey(Menus record);
}