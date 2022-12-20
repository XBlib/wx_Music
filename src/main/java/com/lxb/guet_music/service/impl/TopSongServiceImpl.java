package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.mapper.TopSongMapper;
import com.lxb.guet_music.pojo.Song;
import com.lxb.guet_music.pojo.TopSong;
import com.lxb.guet_music.service.TopSongService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class TopSongServiceImpl extends ServiceImpl<TopSongMapper,TopSong> implements TopSongService {
    @Autowired
    private TopSongMapper topSongMapper;
    @Override
    public List<Song> TopList(String style) {
        return topSongMapper.TopList(style);
    }

    @Override
    public List<TopSong> getStyle() {
        return topSongMapper.getStyle();
    }
}
