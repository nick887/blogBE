package com.nick.blog.controller;

import com.nick.blog.dto.BlogDTO;
import com.nick.blog.dto.UserDTO;
import com.nick.blog.service.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author nick
 * @Classname UserController
 * @Description TODO
 * @Date 2021/5/4 8:50 下午
 * @Created by txiao
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Qualifier("userServiceImpl")
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public int userLogIn(@RequestBody UserDTO userDTO)
    {
        int res=userService.userLogin(userDTO);
        return res;
    }
}
