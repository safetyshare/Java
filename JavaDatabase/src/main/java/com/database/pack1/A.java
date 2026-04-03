package com.database.pack1;

import com.database.pack2.D;

public class A {
        public int x = 1;
        protected int y = 2;
        int z = 3;
        public int a = 100;
        public void display () {
            B b1 = new B();
            // System.out.println(b1.a);
            System.out.println(b1.b);
            System.out.println(b1.c);
            System.out.println(b1.k);
            D d1 = new D();
            // System.out.println(d1.t);
            // System.out.println(d1.g);
            // System.out.println(d1.f);
            System.out.println(d1.k);
        }
    }

