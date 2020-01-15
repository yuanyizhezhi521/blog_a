package xyz.blog.xuexi.dao;

import org.apache.ibatis.annotations.Mapper;
import xyz.blog.xuexi.pojo.Users;
public interface UsersMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    Users selectByNameAndPwd(Users users);

}