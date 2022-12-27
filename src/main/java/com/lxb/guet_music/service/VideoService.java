package com.lxb.guet_music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxb.guet_music.pojo.Video;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
public interface VideoService extends IService<Video> {
    public List<Video> getVide(Integer navid);
}
