package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.mapper.BannerMapper;
import com.lxb.guet_music.mapper.RecommendMapper;
import com.lxb.guet_music.pojo.Banner;
import com.lxb.guet_music.pojo.Recommend;
import com.lxb.guet_music.service.BannerService;
import com.lxb.guet_music.service.RecommendService;
import org.springframework.stereotype.Service;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class RecommendImpl extends ServiceImpl<RecommendMapper, Recommend> implements RecommendService {
}
