package com.lxb.guet_music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxb.guet_music.common.Result;
import com.lxb.guet_music.pojo.Record;

import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
public interface RecordService extends IService<Record> {
    public List<Record> recordList(Integer uid);

    Boolean addRecent(Integer id, String pic);
}
