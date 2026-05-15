package com.advanced.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map1 {
    static void main() {
        Map map=new HashMap<>();
        map.put(1,"Jack");
        map.put(2,"Rose");
        map.put(3,"Lucky");
        map.put(4,"Tom");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("____________");
        Set keySet=map.keySet();
        Iterator iterator=keySet.iterator();
        while (iterator.hasNext()){
                Object key=iterator.next();
                Object value=map.get(key);
                System.out.println(key+":"+value);
            }
        System.out.println("-------------");
        Set entryset =map.entrySet();
        Iterator it=entryset.iterator();
        while (it.hasNext()){
            Map.Entry entry=(Map.Entry)it.next();
            Object key=entry.getKey();
            Object value=entry.getValue();
            System.out.println(key+":"+value);
        }
        keySet.forEach(o->System.err.println(o+"="+map.get(o)));
        map.forEach((key,value)-> System.out.println(key+":"+value));
        }
    }

