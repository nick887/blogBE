package com.nick.blog.controller;

import com.nick.blog.mapper.TimeRecordMapper;
import com.nick.blog.po.TimeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nick
 * @Classname TimeRecordController
 * @Description TODO
 * @Date 2021/4/29 1:36 下午
 * @Created by txiao
 */
@RestController
@RequestMapping("/time")
public class TimeRecordController {
    @Autowired
    TimeRecordMapper timeRecordMapper;

    @RequestMapping("/timeRecord")
    public TimeRecord getTimeRecord(){
        return timeRecordMapper.getTimeRecord();
    }
}
