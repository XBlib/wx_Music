package com.lxb.guet_music.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lxb.guet_music.mapper.RecordMapper;
import com.lxb.guet_music.pojo.Record;
import com.lxb.guet_music.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * @author XBlib
 * @version 1.0
 */
@Service
public class RecordServiceImpl extends ServiceImpl<RecordMapper, Record> implements RecordService {
    @Autowired
    private RecordMapper recordMapper;
    @Override
    public List<Record> recordList(Integer uid) {
        List<Record> records = recordMapper.selectList(Wrappers.<Record>lambdaQuery().eq(Record::getUid, uid));
        return records;
    }
}
