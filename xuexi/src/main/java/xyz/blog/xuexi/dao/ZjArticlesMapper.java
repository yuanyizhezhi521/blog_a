package xyz.blog.xuexi.dao;

import xyz.blog.xuexi.pojo.ZjArticles;
import xyz.blog.xuexi.pojo.ZjArticlesWithBLOBs;

public interface ZjArticlesMapper {
    int deleteByPrimaryKey(Long articleId);

    int insert(ZjArticlesWithBLOBs record);

    int insertSelective(ZjArticlesWithBLOBs record);

    ZjArticlesWithBLOBs selectByPrimaryKey(Long articleId);

    int updateByPrimaryKeySelective(ZjArticlesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ZjArticlesWithBLOBs record);

    int updateByPrimaryKey(ZjArticles record);
}