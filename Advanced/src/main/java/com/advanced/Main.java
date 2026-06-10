package com.advanced;

public class Main {
    static void main() {
        IO.println(String.format("Hello and welcome!"));

        for (int i = 1; i <= 5; i++) {
            IO.println("i = " + i);
        }
    NewTest.display1();

    }
}
class NewTest{
    public static final String display1(){
        String s1=IO.readln("first");
        String s2=IO.readln("second");
        String s3=IO.readln("third");
        IO.println(s1+s2+s3);
        return s1;
    }

}