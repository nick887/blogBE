package com.nick.blog.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * @author nick
 * @Classname DayVisitCount
 * @Description TODO
 * @Date 2021/5/3 1:58 上午
 * @Created by txiao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DayVisitCount {
    private int id;
    private Date date;
    private int visitCountSum;
}
