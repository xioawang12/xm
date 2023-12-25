package com.xm.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xm.utils.Result;

@Controller
public class Upload {
	@ResponseBody
	@RequestMapping("/upload")
public Result uploadImg(MultipartFile file, HttpServletRequest request) throws IOException {
	/**
     * 上传图片
     */
	 String originalFilename = file.getOriginalFilename();
        //新的文件名字
        String newFileName = originalFilename;
	String uploadOir = request.getServletContext().getRealPath("/images");
    File file1 =new File(uploadOir);
    if (!file1.exists()){
        file1.mkdir();
    }
    System.out.println("文件上传路径"+uploadOir+"/"+newFileName);
//    保存到指定位置
    file.transferTo(new File(uploadOir,newFileName));
    //图片上传成功后，将图片的地址写到数据库
    //String filePath = "E:\\t";//保存图片的路径
    //获取原始图片的拓展名
   
    File targetFile = new File(uploadOir,newFileName); 
    file.transferTo(targetFile);
    return new Result(0, newFileName);
}
}
