package com.advanced.jdbc;

import java.sql.*;

public class jdbc1 {
    static void main() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("加载驱动错误"+e.getMessage());
        }
        String url="jdbc:mysql://127.0.0.1:3306/jdbc";
        String user="root";
        String password="mysql";
        try (Connection con= DriverManager.getConnection(url,user,password); Statement stmt=con.createStatement(); ResultSet rs=stmt.executeQuery("select * from jdbc.user")){
            while (rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String sex=rs.getString("sex");String email=rs.getString("email");
                Date birthday=rs.getDate("birthday");
                System.out.println("序号："+id+"\t姓名"+name+"\t性别"+sex+"\t邮箱"+email+"\t生日"+birthday);
            }
        }
        catch (SQLException e) {
            System.err.println("访问失败"+e.getMessage());
        }
    }
}
