package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjSetArtitleLabel;

public interface ZjSetArtitleLabelMapper {
    int deleteByPrimaryKey(Long articleId);

    int insert(ZjSetArtitleLabel record);

    int insertSelective(ZjSetArtitleLabel record);

    ZjSetArtitleLabel selectByPrimaryKey(Long articleId);

    int updateByPrimaryKeySelective(ZjSetArtitleLabel record);

    int updateByPrimaryKey(ZjSetArtitleLabel record);
}