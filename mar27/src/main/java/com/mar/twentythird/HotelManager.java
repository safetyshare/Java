package com.mar.twentythird;
import java.util.Scanner;
public class HotelManager {
    private static String[][] rooms =new String[5][10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        System.out.println("欢迎来到XXX大酒店！");
        System.out.println("--1.查询房间  2.办理入住  3.办理退房  4.退出系统--");
        while (true) {
            System.out.println("请输入指令：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    search();
                    break;
                case 2:
                    in();
                    break;
                case 3:
                    out();
                    break;
                case 4:
                    exit();
                default:
                    System.out.println("你输入的指令错误，请重新输入！");
            }
            
        }
    }
    public static void init() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = "EMPTY";
            }
        }
        System.out.println("房间初始化完毕");
    }
    public static void search() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                int roomNo=(i+1)*100+j+1;
                System.out.print(roomNo + "\t");
            }
            System.out.println();
            for (int k = 0; k < rooms[i].length; k++) {
                System.out.print(rooms[i][k] + "\t");}
            System.out.println();
        }
    }
}
