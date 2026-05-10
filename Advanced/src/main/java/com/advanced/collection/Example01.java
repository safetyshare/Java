package com.advanced.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.UUID;

public class Example01 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList<>();
        list.add("stud1");
        list.add("stud2");
        list.add("stud3");
        list.clear();
        list.add("stud3");
        System.out.println(list.size());
        try {
            System.out.println(list.get(1));
            System.out.println(list.indexOf("stud3"));
        } catch (Exception e) {
            // e.printStackTrace();
            // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
        System.out.println(list.indexOf("stud3"));

    LinkedList link1=new LinkedList<>();
    for (int i = 0; i < 50; i++) {
        link1.add(UUID.randomUUID());
        
    }
        for (Object o : link1) {
            System.out.println(o);

        }
        System.out.println();
    ArrayList<String> Ali=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Ali.add(UUID.randomUUID().toString());
        }
        for (int i = 0; i < Ali.size(); i++) {
            System.out.println(Ali.get(i));
        }

    }
}
