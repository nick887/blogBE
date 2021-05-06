package com.nick.blog.controller;

import com.nick.blog.service.fileService.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * @author nick
 * @Classname FileController
 * @Description TODO
 * @Date 2021/5/6 7:07 下午
 * @Created by txiao
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @Autowired
    FileService fileService;


    @PostMapping("/upload")
    public ResponseEntity uploadFiles(
            @RequestPart("file")MultipartFile[] multipartFiles
            ){

        int res=fileService.fileUpload(multipartFiles);
        if(res==0)
        {
            return ResponseEntity.badRequest().body("写入文件错误");
        }
        else
        {
            return ResponseEntity.ok().body("上传文件成功");
        }
    }

    @GetMapping("/download/{filename}")
    public ResponseEntity downloadFile(@PathVariable("filename") String filename, HttpServletResponse response)
    {
        int res = fileService.fileDownload(filename, response);
        if(res==1)
        {
            return ResponseEntity.ok().body("传输成功");
        }
        else
        {
            return ResponseEntity.badRequest().body("请求失败");
        }
    }

}
