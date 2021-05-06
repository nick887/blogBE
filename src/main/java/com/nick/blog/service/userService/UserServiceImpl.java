package com.nick.blog.service.userService;

import com.nick.blog.dto.BlogDTO;
import com.nick.blog.dto.UserDTO;
import com.nick.blog.mapper.UserMapper;
import com.nick.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nick
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2021/5/4 8:48 下午
 * @Created by txiao
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public int userLogin(UserDTO userDTO) {
        User user = userMapper.userLogIn(userDTO);
        if(user!=null)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
