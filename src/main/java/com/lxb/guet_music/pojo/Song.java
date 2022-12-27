package com.lxb.guet_music.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author XBlib
 * @version 1.0
 */
@Data
@TableName("t_song")
public class Song {
    private Integer id;
    private String picUrl;
    private String name;
    private String artname;
    private String durationTime;
    private String url;
}
