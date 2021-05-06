package com.nick.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nick
 * @Classname ErrorController
 * @Description TODO
 * @Date 2021/4/30 3:53 下午
 * @Created by txiao
 */
@RestController
@RequestMapping("/error")
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
    @RequestMapping
    public ResponseEntity error(){
        return new ResponseEntity("请求路由错误", HttpStatus.NOT_FOUND);
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
