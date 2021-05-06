package com.nick.blog.mapper;

import com.nick.blog.dto.UserDTO;
import com.nick.blog.po.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User userLogIn(UserDTO userDTO);
}
