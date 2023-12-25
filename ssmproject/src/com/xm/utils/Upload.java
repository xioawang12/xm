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
     * �ϴ�ͼƬ
     */
	 String originalFilename = file.getOriginalFilename();
        //�µ��ļ�����
        String newFileName = originalFilename;
	String uploadOir = request.getServletContext().getRealPath("/images");
    File file1 =new File(uploadOir);
    if (!file1.exists()){
        file1.mkdir();
    }
    System.out.println("�ļ��ϴ�·��"+uploadOir+"/"+newFileName);
//    ���浽ָ��λ��
    file.transferTo(new File(uploadOir,newFileName));
    //ͼƬ�ϴ��ɹ��󣬽�ͼƬ�ĵ�ַд�����ݿ�
    //String filePath = "E:\\t";//����ͼƬ��·��
    //��ȡԭʼͼƬ����չ��
   
    File targetFile = new File(uploadOir,newFileName); 
    file.transferTo(targetFile);
    return new Result(0, newFileName);
}
}
