package com.nick.blog.service.fileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * @author nick
 * @Classname FileService
 * @Description TODO
 * @Date 2021/5/6 7:07 下午
 * @Created by txiao
 */
@Service
public class FileService {
    public int fileUpload(MultipartFile[] multipartFiles)
    {
        String url = System.getProperty("user.dir")+"/src/main/resources/file";
        for (MultipartFile m :
                multipartFiles) {
            try {
                m.transferTo(new File(url,m.getOriginalFilename()));
            }catch (Exception e)
            {
                return 0;
            }
        }
        return 1;
    }

    public int fileDownload(String filename, HttpServletResponse response)
    {
        String url = System.getProperty("user.dir")+"/src/main/resources/file";
        try {
            File file=new File(url,filename);
            if(!file.exists())
            {
                throw new Exception();
            }
            response.reset();
            response.setContentType("application/octet-stream");
            response.setCharacterEncoding("utf-8");
            response.setContentLength((int) file.length());
            response.setHeader("Content-Disposition", "attachment;filename=" + filename );

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            byte[] buff = new byte[1024];
            OutputStream os  = response.getOutputStream();
            int i = 0;
            while ((i = bis.read(buff)) != -1) {
                os.write(buff, 0, i);
                os.flush();
            }
            return 1;
        }catch (Exception e)
        {
            return 0;
        }

    }

}
