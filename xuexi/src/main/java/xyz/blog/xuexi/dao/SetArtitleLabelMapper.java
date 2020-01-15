package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.SetArtitleLabel;

public interface SetArtitleLabelMapper {
    int deleteByPrimaryKey(Long articleId);

    int insert(SetArtitleLabel record);

    int insertSelective(SetArtitleLabel record);

    SetArtitleLabel selectByPrimaryKey(Long articleId);

    int updateByPrimaryKeySelective(SetArtitleLabel record);

    int updateByPrimaryKey(SetArtitleLabel record);
}