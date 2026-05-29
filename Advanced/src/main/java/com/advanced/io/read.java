package com.advanced.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {
    @SuppressWarnings("resource")
    static void main() {
        FileReader fr=null;
        try {
            fr=new FileReader("src\\main\\resources\\test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int len=0;
        while (true){
            try {
                if (!((len= fr.read())!=-1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.print((char) len);
        }
        try {
            if (fr!=null){fr.close();}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
