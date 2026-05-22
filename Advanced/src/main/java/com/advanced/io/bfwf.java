package com.advanced.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class bfwf {
    public static void main(String[] args) throws Exception {
        // 创建一个字符输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\reader.txt"));
        // 创建一个字符输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\resources\\writer.txt",true));
        // 声明一个字符串变量str
        String str = null;
        // 循环时每次读取一行文本，如果不为null（即未到文件末尾），则继续循环
        while ((str = br.readLine()) != null) {
            // 通过缓冲流对象写入文件
            bw.write(str);
            // 写入一个换行符，该方法会根据不同的操作系统生成相应的换行符
            bw.newLine();
        }
        // 关闭流
        br.close();
        bw.close();
        }
    }
