package com.nick.blog.mapper;


import com.nick.blog.po.DayVisitCount;
import com.nick.blog.po.TimeRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRecordMapper {
    TimeRecord getTimeRecord();
}
