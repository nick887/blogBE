package com.nick.blog.service.blogService;

import com.nick.blog.dto.BlogDTO;
import com.nick.blog.po.Blog;

import java.util.List;

/**
 * @author nick
 */

public interface BlogService {
    /**
     * @Author nick
     * @Description //TODO 分页查找博文
     * @Date 12:43 下午 2021/4/30
     * @Param []
     * @return java.util.List<com.nick.blog.po.Blog>
     **/
    List<Blog> queryBlogPaged(int pageNumb,int pageSize);

    Blog getABlog(int id);

}
