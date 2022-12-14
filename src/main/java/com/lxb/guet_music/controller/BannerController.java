package com.lxb.guet_music.controller;

import com.lxb.guet_music.pojo.Banner;
import com.lxb.guet_music.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;
    @RequestMapping("/list")
    public List<Banner> getBanner() {
        return bannerService.list();

    }
}
