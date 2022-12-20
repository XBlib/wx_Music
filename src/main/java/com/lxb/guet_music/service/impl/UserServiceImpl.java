package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.common.Constans;
import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.exception.ServiceException;
import com.lxb.guet_music.mapper.UserMapper;
import com.lxb.guet_music.pojo.User;
import com.lxb.guet_music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User login(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("phone",user.getPhone());
        queryWrapper.eq("password",user.getPassword());
        User one = null;
        try {
            one = getOne(queryWrapper);
        } catch (Exception e) {
            throw new ServiceException(Constans.CODE_500,"系统错误");
        }
        if(one != null) {
            return one;
        } else {
            throw new ServiceException(Constans.CODE_600,"用户名和密码错误");
        }



    }

}
