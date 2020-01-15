package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Labels;

public interface LabelsMapper {
    int deleteByPrimaryKey(Long labelId);

    int insert(Labels record);

    int insertSelective(Labels record);

    Labels selectByPrimaryKey(Long labelId);

    int updateByPrimaryKeySelective(Labels record);

    int updateByPrimaryKeyWithBLOBs(Labels record);

    int updateByPrimaryKey(Labels record);
}