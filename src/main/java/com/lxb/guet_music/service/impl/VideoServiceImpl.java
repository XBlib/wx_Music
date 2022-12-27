package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.mapper.VideoMapper;
import com.lxb.guet_music.pojo.Video;
import com.lxb.guet_music.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {
    @Autowired
    private VideoMapper mapper;
    public List<Video> getVide(Integer navid) {
        List<Video> videos = mapper.selectList(Wrappers.<Video>lambdaQuery().eq(Video::getNavid, navid));
        return videos;
    }
}
