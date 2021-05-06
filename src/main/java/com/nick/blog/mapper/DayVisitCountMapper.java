package com.nick.blog.mapper;

import com.nick.blog.po.DayVisitCount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DayVisitCountMapper {
    /**
     * @Author nick
     * @Description //TODO 创建当天的访问记录
     * @Date 12:41 下午 2021/5/3
     * @param dayVisitCount
     * @return int
     **/
    int CreateDayRecord(DayVisitCount dayVisitCount);

    /**
     * @Author nick
     * @Description //TODO 日访问量+1
     * @Date 12:49 下午 2021/5/3
     * @param
     * @return int
     **/
    int dayRecordIncrement(@Param("num") int num);

}
