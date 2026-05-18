package com.advanced.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class set1 {
    static void main() {
        HashSet<String> h1=new HashSet<>();
        h1.add("Git");
        h1.add("Github");
        h1.add("Gitee");
        h1.add("gitlab");
        h1.add("Git");
        h1.add(Integer.toString((int)(Math.random()*10)));
        h1.forEach(System.out::println);
        System.out.println();
        TreeSet<String> t1=new TreeSet<>();
        t1.add("cookies");
        t1.add("session");
        t1.add("token");
        t1.add("jwt");
        t1.forEach(System.out::println);
    }
}
