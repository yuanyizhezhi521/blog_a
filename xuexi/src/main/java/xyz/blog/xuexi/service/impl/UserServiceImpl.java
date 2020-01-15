package xyz.blog.xuexi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.blog.xuexi.dao.UsersMapper;
import xyz.blog.xuexi.pojo.Users;
import xyz.blog.xuexi.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public Users login(Users users) {
        usersMapper.selectByNameAndPwd(users);
        return null;
    }
}
