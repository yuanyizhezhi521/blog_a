package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjLabels;

public interface ZjLabelsMapper {
    int deleteByPrimaryKey(Long labelId);

    int insert(ZjLabels record);

    int insertSelective(ZjLabels record);

    ZjLabels selectByPrimaryKey(Long labelId);

    int updateByPrimaryKeySelective(ZjLabels record);

    int updateByPrimaryKeyWithBLOBs(ZjLabels record);

    int updateByPrimaryKey(ZjLabels record);
}