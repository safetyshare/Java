package org.example;
public class Main {
    public static void main(String[] args) {
        int x=5,y=7;
        int z;
        z=(x++)+y;//5+7=12
        System.out.println(z);
        x=5;z=++x+y;//x先自加变成6，6+7=13
        System.out.println(z);
        x=5;z=-x++;
        System.out.println("z："+z+"x："+x);
        testbooleam.main(args);
    }
}
