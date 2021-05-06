package com.nick.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nick
 * @Classname UserDTO
 * @Description TODO
 * @Date 2021/5/4 8:45 下午
 * @Created by txiao
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String account;
    private String password;
}
