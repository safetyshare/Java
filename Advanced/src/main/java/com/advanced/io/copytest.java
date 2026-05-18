package com.advanced.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copytest {
    static void main() {
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream("src\\main\\resources\\test.txt");
            fos = new FileOutputStream("src\\main\\resources\\2.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int c=0;
        while (true){
            try {
                if (!((c=fis.read())!=-1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fos.write(c);
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
    }
}
