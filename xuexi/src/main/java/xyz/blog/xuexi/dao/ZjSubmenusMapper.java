package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjSubmenus;

public interface ZjSubmenusMapper {
    int deleteByPrimaryKey(Long linkId);

    int insert(ZjSubmenus record);

    int insertSelective(ZjSubmenus record);

    ZjSubmenus selectByPrimaryKey(Long linkId);

    int updateByPrimaryKeySelective(ZjSubmenus record);

    int updateByPrimaryKey(ZjSubmenus record);
}