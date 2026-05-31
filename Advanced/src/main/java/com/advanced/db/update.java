package com.advanced.db;

import java.sql.*;

public class update {
    static void main() {
        PreparedStatement stmt;
        try (Connection connection=ConnectionFactory.getConnection()){
            String sql = "update jdbc.user set email=? where NAME=?;";
            stmt = connection.prepareStatement(sql);
            stmt.setString(2, "黎明");
            stmt.setString(1, "liming@hbsi.edu.cn");
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("执行成功，修改了" + result + "条数据");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
