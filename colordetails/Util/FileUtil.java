package com.example.colordetails.Util;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileUtil {
    //文件上传工具类服务方法
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {

        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new
                FileOutputStream(targetFile.getAbsoluteFile() + "/" + fileName);
        out.write(file);
        out.flush();
        out.close();
    }
//    } public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
//
//        File targetFile = new File(filePath);
//        if (!targetFile.exists()) {
//            targetFile.mkdirs();
//        }
//        FileOutputStream out = new
//                FileOutputStream(filePath +  fileName);
//        out.write(file);
//        out.flush();
//        out.close();
//    }

    public static String getUpLoadFilePath() {
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (!path.exists()) {
            path = new File("");
        }
        File filePath = new File(path.getAbsolutePath(),"static/images/upload/");
        return filePath.getAbsolutePath();
    }
}
