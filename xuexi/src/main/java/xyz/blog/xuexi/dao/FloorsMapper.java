package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Floors;

public interface FloorsMapper {
    int deleteByPrimaryKey(Long floorId);

    int insert(Floors record);

    int insertSelective(Floors record);

    Floors selectByPrimaryKey(Long floorId);

    int updateByPrimaryKeySelective(Floors record);

    int updateByPrimaryKeyWithBLOBs(Floors record);

    int updateByPrimaryKey(Floors record);
}