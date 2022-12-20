package com.lxb.guet_music.controller;

import com.lxb.guet_music.pojo.Song;
import com.lxb.guet_music.pojo.TopSong;
import com.lxb.guet_music.service.TopSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/top")
public class TopSongController {
    @Autowired
    private TopSongService service;
    @RequestMapping("/list")
    public List<TopSong> topSongList() {

        List<TopSong> styleList = service.getStyle();
        for (TopSong style : styleList) {
            List<Song> songs = service.TopList(style.getStyle());
            style.setTopList(songs);
        }
        return styleList;

    }
}
