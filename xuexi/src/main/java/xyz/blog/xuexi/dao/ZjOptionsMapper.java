package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjOptions;

public interface ZjOptionsMapper {
    int deleteByPrimaryKey(Integer optionId);

    int insert(ZjOptions record);

    int insertSelective(ZjOptions record);

    ZjOptions selectByPrimaryKey(Integer optionId);

    int updateByPrimaryKeySelective(ZjOptions record);

    int updateByPrimaryKeyWithBLOBs(ZjOptions record);

    int updateByPrimaryKey(ZjOptions record);
}