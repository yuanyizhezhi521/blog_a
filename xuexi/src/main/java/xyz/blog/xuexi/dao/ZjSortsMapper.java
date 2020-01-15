package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjSorts;

public interface ZjSortsMapper {
    int deleteByPrimaryKey(Long sortId);

    int insert(ZjSorts record);

    int insertSelective(ZjSorts record);

    ZjSorts selectByPrimaryKey(Long sortId);

    int updateByPrimaryKeySelective(ZjSorts record);

    int updateByPrimaryKeyWithBLOBs(ZjSorts record);

    int updateByPrimaryKey(ZjSorts record);
}