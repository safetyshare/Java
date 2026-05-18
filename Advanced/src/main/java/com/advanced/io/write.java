package com.advanced.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class write {
    static void main()  {
        FileOutputStream out=null;
        try {
            out=new FileOutputStream("src\\main\\resources\\1.txt",true);
            String s="11";
            out.write(s.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
