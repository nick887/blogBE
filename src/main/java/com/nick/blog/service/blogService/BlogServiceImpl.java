package com.nick.blog.service.blogService;

import com.github.pagehelper.PageHelper;
import com.nick.blog.dto.BlogDTO;
import com.nick.blog.mapper.BlogMapper;
import com.nick.blog.mapper.DayVisitCountMapper;
import com.nick.blog.po.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nick
 * @Classname BlogServiceImpl
 * @Description TODO
 * @Date 2021/4/29 6:22 下午
 * @Created by txiao
 */
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogMapper blogMapper;
    @Autowired
    DayVisitCountMapper dayVisitCountMapper;
    @Override
    public List<Blog> queryBlogPaged(int pageNum,int pageSize) {
        blogMapper.groupBlogVisitCountIncrement(pageNum,pageSize);
        dayVisitCountMapper.dayRecordIncrement(pageSize);
        PageHelper.startPage(pageNum,pageSize);
        return blogMapper.getAllBlog();
    }

    @Override
    public Blog getABlog(int id) {
        blogMapper.blogVisitCountIncrement(id);
        dayVisitCountMapper.dayRecordIncrement(1);
        return blogMapper.getABlog(id);
    }
}
