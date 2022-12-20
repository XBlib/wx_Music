package com.lxb.guet_music.controller;

import com.lxb.guet_music.pojo.Banner;
import com.lxb.guet_music.pojo.Recommend;
import com.lxb.guet_music.service.BannerService;
import com.lxb.guet_music.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@RestController
@RequestMapping("/rec")
public class RecommendController {
    @Autowired
    private RecommendService recommendService;
    @PostMapping("/list")
    public List<Recommend> addBanner() {
        return recommendService.list();

    }
}
