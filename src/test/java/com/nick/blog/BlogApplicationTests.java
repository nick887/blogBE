package com.nick.blog;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nick.blog.dto.BlogDTO;
import com.nick.blog.mapper.BlogMapper;
import com.nick.blog.mapper.DayVisitCountMapper;
import com.nick.blog.service.blogService.BlogService;
import com.nick.blog.service.dayVisitCountService.DayVisitCountService;
import com.nick.blog.service.fileService.FileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    BlogMapper blogMapper;

    @Autowired
    @Qualifier("dayVisitCountServiceImpl")
    DayVisitCountService dayVisitCountService;


    @Autowired
    @Qualifier("blogServiceImpl")
    BlogService blogService;

    @Autowired
    FileService fileService;

    @Test
    void abc(){

    }

}
