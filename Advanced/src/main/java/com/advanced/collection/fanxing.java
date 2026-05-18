package com.advanced.collection;

import java.util.ArrayList;

public class fanxing {
    static void main() {
        ArrayList<String> list=new ArrayList<>();
        list.add("AA");
        list.add("BB");
        list.add(String.valueOf(1));
        for(String s:list){
            System.out.println(s);
        }
    }
}
