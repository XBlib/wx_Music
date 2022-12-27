package com.lxb.guet_music.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.pojo.Video;
import com.lxb.guet_music.pojo.VideoPage;
import com.lxb.guet_music.service.GroupService;
import com.lxb.guet_music.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private VideoService videoService;
    @PostMapping("/group/list")
    public Result getGroupList() {
        return Result.success(groupService.list());
    }
    @PostMapping("/group")
    public Result getVideoList(@RequestBody Video video) {
        List<Video> videList = videoService.getVide(video.getNavid());
        return Result.success(videList);
    }

    @PostMapping("/group/page")
    public Result roleOfPage(@RequestBody VideoPage videoPage

                             ){
        IPage<Video> page = new Page<>(videoPage.getPageNum(),videoPage.getPageSize());
        QueryWrapper<Video> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("navid",videoPage.getNavid());

        IPage<Video> page1 = videoService.page(page, queryWrapper);
        return Result.success(page1);
    }

}
