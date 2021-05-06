package com.nick.blog.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author nick
 * @Classname Blog
 * @Description TODO
 * @Date 2021/4/29 12:51 下午
 * @Created by txiao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private String content;
    private int id;
    private Timestamp releaseTime;
    private Timestamp updateTime;
    private int likes;
    private int topic;
    private int visitCount;
    private String title;
}
