package com.database.jul03;

public class test1 {
    static void main(){
        double[] arrayA={45.4,488.3,155.3,784.1,6589,32,4758.89,123,478};
        double max=arrayA[0],min=arrayA[0];
        int maxIndex=0,minIndex=0;
        for (int i = 0; i < arrayA.length; i++) {
            if (max<arrayA[i]) {
                max=arrayA[i];
                maxIndex=i;
            }
            if (min>arrayA[i]) {
                min=arrayA[i];
                minIndex=i;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Max index："+maxIndex);
        System.out.println("Min index："+minIndex);
    }
}
