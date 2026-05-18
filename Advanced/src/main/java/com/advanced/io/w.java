package com.advanced.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class w {
    static void main() throws IOException {
        FileOutputStream out=new FileOutputStream("src\\main\\resources\\1.txt");
        String s="11";
        out.write(s.getBytes());
        out.close();
    }
}
