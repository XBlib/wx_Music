package com.lxb.guet_music.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.lxb.guet_music.common.Constans;
import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.mapper.RecordMapper;
import com.lxb.guet_music.pojo.Record;
import com.lxb.guet_music.pojo.User;
import com.lxb.guet_music.service.RecordService;
import com.lxb.guet_music.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RecordService recordService;
    //用户登录
    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        String username = user.getPhone();
        String password = user.getPassword();
        if (StrUtil.isBlank(username) || StrUtil.isBlank(password)) {
            return Result.error(Constans.CODE_600, "用户名或密码错误");
        }
        User crruser = userService.login(user);
        System.out.println(2);
        return Result.success(crruser);
    }
    @PostMapping("/record")
    public Result record(@RequestBody Record uid){
        List<Record> records = recordService.recordList(uid.getUid());
        return Result.success(records);
    }
    @PostMapping("/regist")
    public Result regist(@RequestBody User user) {
        String phone = user.getPhone();
        String password = user.getPassword();
        if (StrUtil.isBlank(phone) || StrUtil.isBlank(password)) {
            return Result.error(Constans.CODE_600, "参数错误");
        }
        return userService.regUser(user);
    }

    @PostMapping("/addRecent")
    public Result addRecent(@RequestBody Record record) {
        Boolean aBoolean = recordService.addRecent(record.getUid(), record.getPicurl());
        if(aBoolean) {
            return Result.success();
        }
        return Result.error("该记录以存在");
    }
}
