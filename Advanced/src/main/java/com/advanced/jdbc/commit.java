package com.advanced.jdbc;

import java.sql.*;

public class commit {
    static void main() {
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
        try {
            // 1. 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.通过DriverManager获取数据库连接
            String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
            String username = "root";
            String password = "mysql";
            String sql = "insert into jdbc.user(name, sex, email, birthday) values (?,?,?,?);";
            try(Connection conn =DriverManager.getConnection(url, username, password);PreparedStatement stmt =conn.prepareStatement(sql);){
//            conn = DriverManager.getConnection(url, username, password);
            // 3.通过Connection对象获取Statement对象
            // 4.使用Statement执行SQL语句
            conn.setAutoCommit(false);
            sql = "insert into jdbc.user(name, sex, email, birthday) values (?,?,?,?);";
//            stmt = conn.prepareStatement(sql);
            stmt.setString(1,"黎明");
            stmt.setString(2,"男");
            stmt.setString(3,"liming@aa.com");
            stmt.setDate(4, Date.valueOf("1993-02-01"));
            int result =0;
            result+=stmt.executeUpdate();
            stmt.setString(1,"麦克");
            stmt.setString(2,"女");
            stmt.setString(3,"Mike@bb.com");
            stmt.setDate(4, Date.valueOf("1980-07-29"));
            result+=stmt.executeUpdate();
            conn.commit();
            conn.setAutoCommit(true);
            if (result > 0) {
                System.out.println("执行成功，修改了" + result + "条数据");
            }

        } catch (Exception e) {
            e.printStackTrace();
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
