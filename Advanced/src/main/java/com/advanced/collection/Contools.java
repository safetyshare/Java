package com.advanced.collection;

import java.util.ArrayList;
import java.util.Collections;
public class Contools {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,6);
        Collections.shuffle(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
