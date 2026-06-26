package file;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.util.LinkedList;

public class ks {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.addFirst("F");
        link.addLast("L");
        for (int i = 0; i < link.size(); i++) {
            link.remove(i);
        }
        System.out.println(link);
        String s=IO.readln();
        int a=Integer.parseInt(s);
        System.out.println(a);
    }
}
