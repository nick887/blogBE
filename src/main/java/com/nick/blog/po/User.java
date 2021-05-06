package com.nick.blog.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nick
 * @Classname User
 * @Description TODO
 * @Date 2021/5/4 8:43 下午
 * @Created by txiao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String account;
    private String password;
    private String role;
    private String name;
}
