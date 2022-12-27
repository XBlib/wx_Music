package com.lxb.guet_music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.pojo.User;

/**
 * @author XBlib
 * @version 1.0
 */
public interface UserService extends IService<User> {
    User login(User user);
    Result regUser(User user);


}
