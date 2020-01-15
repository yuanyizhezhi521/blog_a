package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Submenus;

public interface SubmenusMapper {
    int deleteByPrimaryKey(Long linkId);

    int insert(Submenus record);

    int insertSelective(Submenus record);

    Submenus selectByPrimaryKey(Long linkId);

    int updateByPrimaryKeySelective(Submenus record);

    int updateByPrimaryKey(Submenus record);
}