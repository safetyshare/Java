package com.database.mar23;

public class fib {
    static void main() {
        int[] shulie;
        shulie=new int[20];
        shulie[0]=1;
        shulie[1]=1;
        for(int i=2;i<shulie.length;i++){
            shulie[i]=shulie[i-1]+shulie[i-2];
        }
        for (int i=0 ;i<shulie.length;i++) {
            System.out.print(shulie[i]+"\t");
            if ((i+1)%8==0) {
                System.out.println();
                
            }
        }
    }
}
