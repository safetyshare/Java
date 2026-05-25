package com.advanced.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example01 {
    static void main() throws Exception {
//        1.加载数据库驱动
//        Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取数据库连接
        String url="jdbc:mysql://127.0.0.1:3306/schooldb";
        String user="root";
        String password="mysql";
        Connection con= DriverManager.getConnection(url,user,password);
//        3.获取 Statement 对象
        Statement stmt= con.createStatement();
//        4.执行 SQL 语句
        ResultSet rs= stmt.executeQuery("select * from schooldb.student");
//        5.操作 ResultSet 结果集
        while (rs.next()){
            String id= rs.getString("学号");
            String name=rs.getString("姓名");
            System.out.println("姓名："+name+"\t学号："+id);
        }
//        6.关闭连接，释放资源
        rs.close();
        stmt.close();
        con.close();
    }
}
