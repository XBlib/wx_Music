package com.lxb.guet_music.controller;

import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.pojo.Song;
import com.lxb.guet_music.pojo.TopSong;
import com.lxb.guet_music.service.SongService;
import com.lxb.guet_music.service.TopSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    @Autowired
    private SongService songService;
    @RequestMapping("/list")
    public List<TopSong> topSongList() {

        List<TopSong> styleList = service.getStyle();
        for (TopSong style : styleList) {
            List<Song> songs = service.TopList(style.getStyle());
            style.setTopList(songs);
        }
        return styleList;
    }
    @RequestMapping("/recommend")
    public Result recommendSong() {
        List<Song> list = songService.list();
        return Result.success(list);
    }
    @RequestMapping("/song/detail")
    public Result songDetail(@RequestBody Song song) {
        Song s = songService.getById(song.getId());
        return Result.success(s);
    }
    @RequestMapping("/song/url")
    public Result songUrl(@RequestBody Song song) {
        String url = songService.getById(song.getId()).getUrl();
        return Result.success(url);

    }
}
