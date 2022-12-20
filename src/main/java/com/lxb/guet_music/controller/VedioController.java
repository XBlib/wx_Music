package com.lxb.guet_music.controller;

import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.pojo.Banner;
import com.lxb.guet_music.pojo.Group;
import com.lxb.guet_music.pojo.Video;
import com.lxb.guet_music.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/video")
public class VedioController {
    @Autowired
    private GroupService groupService;
    @PostMapping("/group/list")
    public Result getGroupList() {
        return Result.success(groupService.list());
    }
}
