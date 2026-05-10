package com.advanced.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example02 {
    static void main() {
        ArrayList<String> list =new ArrayList<>();
        list.add("stud1");
        list.add("stud2");
        list.add("stud3");
        list.add("stud5");
        // 1.迭代方法1 iterator 迭代器
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------");
        // 2.迭代方法2 增强for循环
        for (Object object : list) {
            System.out.println(object);
        }
        System.out.println("---------");
        // 3.迭代方法3 lambda表达式
        //list.forEach(o->System.out.println(o));
        list.forEach(System.out::println);

    }
}
