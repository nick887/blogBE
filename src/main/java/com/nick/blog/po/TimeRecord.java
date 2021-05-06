package com.nick.blog.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author nick
 * @Classname TimeRecord
 * @Description TODO
 * @Date 2021/4/29 1:28 下午
 * @Created by txiao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeRecord {
    private int id;
    private Timestamp createTime;
}
