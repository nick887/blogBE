package com.nick.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nick
 * @Classname BlogDTO
 * @Description TODO
 * @Date 2021/4/29 1:19 下午
 * @Created by txiao
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogDTO {
    private int id;
    private String content;
    private int topic=1;
    private String title;
}
