package com.database.mar20;

public class example3 {
    static void main(){
        int gong,mu,xiao3;
        for(gong=1;gong<=33;gong++){
            for(mu=1;mu<=50;mu++){
                for(xiao3=1;xiao3<=33;xiao3++){
                    if (gong+mu+(xiao3*3)!=100) {
                        continue;
                    }
                    else{
                        if ((gong*3)+(mu*2)+xiao3==100) {
                            System.out.println("公鸡:"+gong+"母鸡:"+mu+"小鸡:"+xiao3*3);
                        }
                    }
                }
            }
        }
    }
}
