package com.lxb.guet_music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxb.guet_music.pojo.Song;
import com.lxb.guet_music.pojo.TopSong;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
public interface TopSongService extends IService<TopSong> {
    public List<Song> TopList(String style);
    public List<TopSong> getStyle();
}
