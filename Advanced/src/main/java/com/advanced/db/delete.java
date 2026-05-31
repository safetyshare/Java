package com.advanced.db;

import java.sql.*;

public class delete {
    static void main() {
        PreparedStatement stmt;
        try (Connection conn=ConnectionFactory.getConnection()){
            String sql = "delete jdbc.user from jdbc.user where NAME=?;";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "黎明");
//            stmt.setString(1, "liming@hbsi.edu.cn");
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("执行成功，修改了" + result + "条数据");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
