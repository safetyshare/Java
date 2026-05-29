package com.advanced.io;

import java.io.*;

public class buffcopytest {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws FileNotFoundException {
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
        long start = System.currentTimeMillis();
        int c = 0;
        // BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\main\\resources\\test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\main\\resources\\2.txt"));
//        byte[] buff = new byte[1024];
        while (true) {
            try {
                if (!((c = bis.read()) != -1))
                    break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bos.write(c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时：" + (end - start) + "ms");
    }
}
