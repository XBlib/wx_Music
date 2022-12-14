package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.mapper.GroupMapper;
import com.lxb.guet_music.pojo.Group;
import com.lxb.guet_music.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements GroupService {
}
