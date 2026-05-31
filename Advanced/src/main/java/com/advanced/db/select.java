package com.advanced.db;

import java.sql.*;

public class select {
    static void main() {
        try(Connection con=ConnectionFactory.getConnection()){
            String sql="select * from jdbc.student";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
//        5.操作 ResultSet 结果集
            while (rs.next()){
                String id= rs.getString("sid");
                String name=rs.getString("sname");
                System.out.println("姓名："+name+"\t学号："+id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
