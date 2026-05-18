package com.advanced.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copytest {
    public static void main(String[] args) {
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream("src\\main\\resources\\test.txt");
            fos = new FileOutputStream("src\\main\\resources\\2.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        long start=System.currentTimeMillis();
        int c=0;
        byte[] buff=new byte[1024];
        while (true){
            try {
                if (!((c=fis.read(buff))!=-1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fos.write(buff,0,c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            fis.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制文件耗时："+(end-start)+"ms");
    }
}
