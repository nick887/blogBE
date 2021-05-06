package com.nick.blog.controller;

import com.github.pagehelper.PageInfo;
import com.nick.blog.dto.BlogDTO;
import com.nick.blog.mapper.BlogMapper;
import com.nick.blog.mapper.TimeRecordMapper;
import com.nick.blog.po.Blog;
import com.nick.blog.po.TimeRecord;
import com.nick.blog.service.blogService.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nick
 * @Classname BlogController
 * @Description TODO
 * @Date 2021/4/29 12:29 下午
 * @Created by txiao
 */

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    @Qualifier("blogServiceImpl")
    BlogService blogService;

    @Autowired
    BlogMapper blogMapper;


/**
 * @Author nick
 * @Description //TODO 测试
 * @Date 1:33 下午 2021/4/30
 * @param
 * @return java.lang.String
 **/
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
/**
 * @Author nick
 * @Description //TODO 分页返回博文
 * @Date 1:33 下午 2021/4/30
 * @param pageNum
 * @param pageSize
 * @return java.util.Map<java.lang.Object,java.lang.Object>
 **/
    @GetMapping("/blogPage/{pageNum}/{pageSize}")
    public ResponseEntity<Object> getBlogPaged(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        List<Blog> blogs = blogService.queryBlogPaged(pageNum, pageSize);
        Map<Object,Object> map=new HashMap<>();
        PageInfo pageInfo=new PageInfo(blogs);
        map.put("total",pageInfo.getTotal());
        map.put("data",blogs);
        return new ResponseEntity<>(map,HttpStatus.OK);
    }
    /**
     * @Author nick
     * @Description //TODO 增加博文
     * @Date 12:39 上午 2021/5/3
     * @param blogDTO
     * @return org.springframework.http.ResponseEntity
     **/

    @PostMapping("/addABlog")
    public ResponseEntity addABlog(@RequestBody BlogDTO blogDTO){
        int res=blogMapper.addABlog(blogDTO);
        if (res == 1)
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    /**
     * @Author nick
     * @Description //TODO 更新博文
     * @Date 12:39 上午 2021/5/3
     * @param blogDTO
     * @return org.springframework.http.ResponseEntity
     **/

    @PostMapping("/updateABlog")
    public ResponseEntity updateABlog(@RequestBody BlogDTO blogDTO){
        if (blogDTO.getId()==0)
            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        int res = blogMapper.updateABlog(blogDTO);
        if(res==0)
        {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
/**
 * @Author nick
 * @Description //TODO 删除博文
 * @Date 1:20 上午 2021/5/3
 * @param BlogId
 * @return org.springframework.http.ResponseEntity
 **/
    @GetMapping("/deleteABlog/{BlogId}")
    public ResponseEntity deleteABlog(@PathVariable int BlogId){
        int res=blogMapper.deleteABlog(BlogId);
        if(res==1)
            return new ResponseEntity(HttpStatus.OK);
        else
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * @Author nick
     * @Description //TODO 获取单篇博文
     * @Date 2:55 下午 2021/5/3
     * @param id
     * @return org.springframework.http.ResponseEntity
     **/
    @GetMapping("/getABlog/{id}")
    public ResponseEntity getABlog(@PathVariable int id){
        Blog blog=blogService.getABlog(id);
        if(blog==null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        else
            return new ResponseEntity(blog,HttpStatus.OK);
    }




}
