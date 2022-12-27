package com.lxb.guet_music.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author XBlib
 * @version 1.0
 */
@TableName("t_video")
@Data
public class Video {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String vid;
    private String url;
    private Integer navid;
    private String coverUrl;
    private String title;
    private String avatarUrl;
    private String nickname;
    private Integer praisedCount;
    private Integer commentCount;

}
