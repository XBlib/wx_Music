package com.lxb.guet_music.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@Data
@TableName("t_song")
public class TopSong {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField(exist = false)
    private List<Song> topList;
    private String style;
}
