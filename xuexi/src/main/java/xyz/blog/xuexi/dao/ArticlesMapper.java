package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.Articles;
import xyz.blog.xuexi.pojo.ArticlesWithBLOBs;

public interface ArticlesMapper {
    int deleteByPrimaryKey(Long articleId);

    int insert(ArticlesWithBLOBs record);

    int insertSelective(ArticlesWithBLOBs record);

    ArticlesWithBLOBs selectByPrimaryKey(Long articleId);

    int updateByPrimaryKeySelective(ArticlesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticlesWithBLOBs record);

    int updateByPrimaryKey(Articles record);
}