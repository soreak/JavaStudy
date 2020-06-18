package com.study;

import java.io.*;

public class DirCopyTest {
    public static void main(String[] args) {
        copy(new File("C:\\Users\\14989\\Desktop\\soreak\\test"),new File("C:\\Users\\14989\\Desktop\\soreak\\tset"));
    }

    public static void copy(File old, File now){
        //判断存在与是否为文件夹
          if(old.exists()&&old.isDirectory()){
              //创建
              now.mkdir();
              File[] files = old.listFiles();
              if(files!=null&&files.length>0){
                  for (File file : files) {
                      if (file.isFile()){
                          copyFile(file,new File(now,file.getName()));
                      }else{
                          copy(file,new File(now,file.getName()));
                      }
                  }
              }

          }
    }

    public static void copyFile(File begin_file, File final_file) {
        long startTime = System.currentTimeMillis();
        try (
                FileInputStream fis = new FileInputStream(begin_file);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(final_file);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("4耗时:"+(endTime - startTime)/1000.0);
    }

}
