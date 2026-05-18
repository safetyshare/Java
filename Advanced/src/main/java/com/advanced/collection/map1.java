package com.advanced.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map1 {
    static void main() {
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"Jack");
        map.put(2,"Rose");
        map.put(3,"Lucky");
        map.put(4,"Tom");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("____________");
        Set<Integer> keySet=map.keySet();
        Iterator<Integer> iterator=keySet.iterator();
        while (iterator.hasNext()){
                Integer key=iterator.next();
                String value=map.get(key);
                System.out.println(key+":"+value);
            }
        System.out.println("-------------");
        Set<Map.Entry<Integer, String>> entryset =map.entrySet();
        Iterator<Map.Entry<Integer, String>> it=entryset.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry=it.next();
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+":"+value);
        }
        keySet.forEach(o->System.err.println(o+"="+map.get(o)));
        map.forEach((key,value)-> System.out.println(key+":"+value));
        }
    }

