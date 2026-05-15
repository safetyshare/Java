package com.advanced.collection;

import java.util.HashSet;
import java.util.Set;

public class set2 {
    static void main() {
        Set set=new HashSet();
        set.add("Mike");
        set.add("Jack");
        set.add("Rose");
        set.add("Rose");
        set.forEach(System.out::println);
    }
}
