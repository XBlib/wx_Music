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
@TableName("t_recommend")
public class Recommend {
    @TableId(type = IdType.AUTO)
    private Integer rid;
    private String picUrl;
    private String name;
}
