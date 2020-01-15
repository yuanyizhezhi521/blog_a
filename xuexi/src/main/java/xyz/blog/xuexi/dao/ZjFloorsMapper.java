package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjFloors;

public interface ZjFloorsMapper {
    int deleteByPrimaryKey(Long floorId);

    int insert(ZjFloors record);

    int insertSelective(ZjFloors record);

    ZjFloors selectByPrimaryKey(Long floorId);

    int updateByPrimaryKeySelective(ZjFloors record);

    int updateByPrimaryKeyWithBLOBs(ZjFloors record);

    int updateByPrimaryKey(ZjFloors record);
}