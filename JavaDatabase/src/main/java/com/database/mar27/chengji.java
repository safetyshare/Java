package com.database.mar27;
import java.util.Scanner;
public class chengji {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double[][] student = new double[7][4];
        for (int j = 0; j < ((student.length) - 2); j++) {
            for (int i = 0; i < ((student[j].length) - 1); i++) {
                student[j][i] = (int) ((Math.random() * 51) + 50);
                //System.out.print(s2[j][i]+"\t");
            }
//            System.out.println();
/*        for (int i = 0; i < ((student.length) - 2); i++) {
            for (int j = 0; j < (student[i].length - 1); j++) {
                switch(j){
                    case 0:
                        System.out.print("请输入第" + (i + 1) + "个学生的语文成绩：");
                        break;
                    case 1:
                        System.out.print("请输入第" + (i + 1) + "个学生的数学成绩：");
                        break;
                    case 2:
                        System.out.print("请输入第" + (i + 1) + "个学生的英语成绩：");
                        break;
                }
                student[i][j] = sc.nextDouble();
            }
        }*/
            for (int i = 0; i < ((student.length) - 2); i++) {
                student[i][3] = (student[i][0] + student[i][1] + student[i][2]) / 3;
                // String s = String.format("%.2f", student[i][3]);
                // System.out.println(s);
            }
            int h = 0;
            double max, min;
            while (h < 4) {
                max = (int) student[0][h];
                min = (int) student[0][h];
                for (int i = 0; i < ((student.length) - 2); i++) {
                    if (student[i][h] > max) {
                        max = student[i][h];
                    }
                    if (student[i][h] < min) {
                        min =student[i][h];
                    }
                }
                student[5][h] = max;
                student[6][h] = min;
                h++;
            }
        }
        System.out.println("语文\t数学\t英语\t平均分");
        for (double[] ds : student) {
                for (double d : ds) {
                    System.out.print(d + " \t");
                }
                System.out.println();
            }
    }
}
