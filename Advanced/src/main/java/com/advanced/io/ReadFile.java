package com.advanced.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        // 1.创建文件输入流来读取文件
        FileInputStream in=null;
        try {
            in =new FileInputStream("src\\main\\resources\\test.txt") ;
            int b=0;
            // 2.通过循环读取文件内容，当返回-1时结束
            while ((b=in.read()) != -1){
                System.out.println(b);
            }
            // 3.关闭流
            in.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
