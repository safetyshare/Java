package com.advanced.io;

import java.io.FileWriter;
import java.io.IOException;

public class wirte1 {
    static void main() throws IOException {
        FileWriter fw=new FileWriter("src\\main\\resources\\write.txt",true);
        fw.write("轻轻的我走走\r\n");
        fw.write("正如我轻轻的来\r\n");
        fw.flush();fw.close();
        System.out.println("OK");
    }
}
