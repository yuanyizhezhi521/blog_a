package xyz.blog.xuexi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.blog.xuexi.pojo.Users;
import xyz.blog.xuexi.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login (Users zjUsers){
        Users login = userService.login(zjUsers);
        return "ok";
    }
}
