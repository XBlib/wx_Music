package com.lxb.guet_music.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.lxb.guet_music.common.Constans;
import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.pojo.User;
import com.lxb.guet_music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //用户登录
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        String username = user.getUser();
        String password = user.getPassword();
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            return Result.error(Constans.CODE_600, "用户名或密码错误");
        }
        User crruser = userService.login(user);

        return Result.success(crruser);
    }
    //注册用户信息
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        String username = user.getUser();
        String password = user.getPassword();
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            return Result.error(Constans.CODE_600, "参数错误");
        }
        return userService.regUser(user);
    }
}
