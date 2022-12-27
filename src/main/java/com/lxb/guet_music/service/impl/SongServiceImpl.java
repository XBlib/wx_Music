package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.mapper.SongMapper;
import com.lxb.guet_music.pojo.Song;
import com.lxb.guet_music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class SongServiceImpl extends ServiceImpl<SongMapper, Song> implements SongService {
    @Autowired
    private SongMapper songMapper;

}
