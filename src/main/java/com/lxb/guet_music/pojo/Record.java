package com.lxb.guet_music.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author XBlib
 * @version 1.0
 */
@Data
@TableName("t_recent")
public class Record {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String picurl;
    private Integer uid;
}
