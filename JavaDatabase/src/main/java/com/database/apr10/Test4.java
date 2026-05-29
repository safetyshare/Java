package com.database.apr10;

public class Test4 {
    @SuppressWarnings("unused")
    static void main(){
        int x=10,y;
    }
}
class MyClass {
    int x=20,y;//实例变量
    static int a;//类变量
    @SuppressWarnings("unused")
    public void myFunc(int k){ //k局部变量
        int i;//方法体中的局部变量
        {
            //复合语句
            int x=30;//局部变量
        }
    }
}