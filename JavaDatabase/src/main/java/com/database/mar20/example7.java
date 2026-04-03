package com.database.mar20;

public class example7 {
    static void main(){
        long a,b,c;
        for (a=0;a<=9;a++){
            for (b=0;b<=9;b++){
                for (c=0;c<=9;c++){
                    if ((100*a+10*b+c)<=99){continue;}
                    else if((a*a*a)+(b*b*b)+(c*c*c)==(100*a+10*b+c)){
                        System.out.println("水仙花数为："+(100*a+10*b+c));
                    }
                }
            }
        }

    }
}
