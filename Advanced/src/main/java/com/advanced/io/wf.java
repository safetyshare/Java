package com.advanced.io;

import java.io.FileReader;
import java.io.FileWriter;

public class wf {
    public static void main(String[] args) throws Exception {
        //创建 FileReader 对象,并指定需要读取的文件
        FileReader fileReader = new FileReader("src\\main\\resources\\reader.txt");
        //创建 FileWriter 对象,并指定写入数据的目标文件
        FileWriter fileWriter = new FileWriter("src\\main\\resources\\writer.txt",true);
        //定义一个 int 类型的变量 len,其初始化值为 0
        int len = 0;
        //定义一个长度为 1024 的字符数组
        char[] buff = new char[1024];
        //通过循环来判断是否读取到了文件末尾
        while ((len = fileReader.read(buff)) != -1) {
            //输出读取到的字符
            fileWriter.write(buff, 0, len);
        }
        //关闭流
        fileWriter.close();
        fileReader.close();
    }
}
