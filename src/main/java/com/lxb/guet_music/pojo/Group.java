package com.lxb.guet_music.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@Data
@TableName("t_group_list")
public class Group {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer navid;

}
