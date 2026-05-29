package com.advanced.jdbc;

import java.sql.*;

public class update {
    static void main() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.通过DriverManager获取数据库连接
            String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
            String username = "root";
            String password = "mysql";
            conn = DriverManager.getConnection(url, username, password);
            // 3.通过Connection对象获取Statement对象
            // 4.使用Statement执行SQL语句
            String sql = "update user set email=? where NAME=?;";
            stmt = conn.prepareStatement(sql);
            stmt.setString(2, "黎明");
            stmt.setString(1, "liming@hbsi.edu.cn");
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("执行成功，修改了" + result + "条数据");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
