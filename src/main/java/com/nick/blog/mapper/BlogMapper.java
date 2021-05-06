package com.nick.blog.mapper;


import com.nick.blog.dto.BlogDTO;
import com.nick.blog.po.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nick
 */
@Repository
public interface BlogMapper {
    /**
     * @Author nick
     * @Description //TODO 分页返回blog
     * @Date 12:37 下午 2021/4/30
     * @Param []
     * @return java.util.List<com.nick.blog.po.Blog>
     **/
    List<Blog> getAllBlog();
   /**
    * @Author nick
    * @Description //TODO 博文浏览量+1
    * @Date 12:53 下午 2021/4/30
    * @param id
    * @return int
    **/
    int blogVisitCountIncrement(@Param("id") int id);

/**
 * @Author nick
 * @Description //TODO 增加一条博文
 * @Date 2:22 下午 2021/4/30
 * @param blogDTO
 * @return int
 **/
    int addABlog(BlogDTO blogDTO);
/**
 * @Author nick
 * @Description //TODO 更新博文内容与博文主题
 * @Date 2:56 下午 2021/4/30
 * @param blogDTO
 * @return int
 **/
    int updateABlog(BlogDTO blogDTO);

/**
 * @Author nick
 * @Description //TODO 删除博文
 * @Date 1:05 下午 2021/5/3
 * @param id
 * @return int
 **/
    int deleteABlog(@Param("id") int id);

    /**
     * @Author nick
     * @Description //TODO 分页返回的博文浏览量+1
     * @Date 1:16 下午 2021/5/3
     * @param pageNum
 * @param pageSize
     * @return int
     **/
    int groupBlogVisitCountIncrement(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
    /**
     * @Author nick
     * @Description //TODO 获取一条博文
     * @Date 1:22 下午 2021/5/3
     * @param id
     * @return com.nick.blog.po.Blog
     **/
    Blog getABlog(@Param("id") int id);


}
