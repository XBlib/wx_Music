package com.lxb.guet_music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxb.guet_music.pojo.Song;
import com.lxb.guet_music.pojo.TopSong;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@Mapper
public interface TopSongMapper extends BaseMapper<TopSong> {
    public List<Song> TopList(String style);
    public List<TopSong> getStyle();
}
