package com.database.mar16;

public class example6 {
    static void main(){
        int i,sum=0;
        i=1;
/*        while (i<=100){
            sum+=i;
            i++;
        }*/
        do {
            sum+=i;
            i++;
        }
        while(i<=100);
        System.out.println("和为："+sum);

        for(i=1,sum=0;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
