package com.nick.blog.service.dayVisitCountService;

import com.nick.blog.mapper.DayVisitCountMapper;
import com.nick.blog.po.DayVisitCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Date;

/**
 * @author nick
 * @Classname DayVisitCountServiceImpl
 * @Description TODO
 * @Date 2021/5/3 1:57 上午
 * @Created by txiao
 */
@Service
public class DayVisitCountServiceImpl implements DayVisitCountService{

    @Autowired
    DayVisitCountMapper dayVisitCountMapper;


    @Override
    @Scheduled(cron = "0 0 00 * * ?")
    public void createDayRecord() {
        Date time= new java.sql.Date(new java.util.Date().getTime());
        DayVisitCount dayVisitCount=new DayVisitCount();
        dayVisitCount.setVisitCountSum(0);
        dayVisitCount.setDate(time);
        dayVisitCountMapper.CreateDayRecord(dayVisitCount);
    }
}
