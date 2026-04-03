package com.database.mar27;
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
    //办理入住
    public static void in() {
        System.out.println("请输入房间号：");
        Scanner sc = new Scanner(System.in);
        int roomNo = sc.nextInt();
        //把房间号转换为楼层和房间，使其和数组的下标对应
        int floor = roomNo / 100;      //根据房间号得到楼层
        int no = roomNo % 100;         //得到楼层的房间号
        //判断楼层是否正确
        if (floor < 1 || floor > 5 || no < 1 || no > 10) {
            System.out.println("输入房间号有误，请输入指令继续办理入住");
            return;
        }
        //判断房间是否有人入住
        if (!"EMPTY".equals(rooms[floor - 1][no - 1])) {
            System.out.println(roomNo + "已经有人入住，请输入指令继续办理入住");
            return;
        }
        System.out.println("请输入姓名:");
        String name = sc.next();
        rooms[floor - 1][no - 1] = name;
        System.out.println("入住成功！");
    }
    //办理退房
    public static void out(){
        System.out.println("请输入房间号：");
        Scanner sc = new Scanner(System.in);
        int roomNo = sc.nextInt();
        //需要把房间号转换为楼层和房间，使其和数组的下标对应
        int floor = roomNo / 100;    //根据房间号得到楼层
        int no = roomNo % 100;      //得到楼层的房间号
        //判断楼层是否正确
        if(floor<1 || floor>10 || no<1 || no>10){
            System.out.println("输入房间号有误，请输入指令继续办理退房");
            //如何结束函数，函数遇到return结束
            return;
        }
        //判断房间是否有人入住
        if("EMPTY".equals(rooms[floor-1][no-1])){
            System.out.println(roomNo+"没人入住，请输入指令继续办理退房");
            return;
        }
        rooms[floor-1][no-1] = "EMPTY";
        System.out.println("该房间退房成功！");
    }
    //退出
    private static void exit() {
        System.out.println("您退出系统，谢谢使用");
        System.exit(0);
    }
}
