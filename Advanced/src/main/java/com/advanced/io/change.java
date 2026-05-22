package com.advanced.io;

import java.io.*;

public class change {
    public static void main(String[] args) {
        BufferedReader br= null;
        BufferedWriter bw= null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\main\\resources\\1.txt")));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\main\\resources\\3.txt",true)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String line=null;
        try {
            while ((line = br.readLine()) != null) {
                // 通过缓冲流对象写入文件
                bw.write(line);
                // 写入一个换行符，该方法会根据不同的操作系统生成相应的换行符
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
