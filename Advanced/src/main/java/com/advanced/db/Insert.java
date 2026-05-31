package com.advanced.db;

import java.sql.*;

public class Insert {
    static void main(){
        PreparedStatement stmt;
        try (Connection conn=ConnectionFactory.getConnection()){
            String sql = "insert into jdbc.user(name, sex, email, birthday) values (?,?,?,?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,"黎明");
            stmt.setString(2,"男");
            stmt.setString(3,"liming@aa.com");
            stmt.setDate(4, Date.valueOf("1993-02-01"));
            int result=stmt.executeUpdate();
            if (result>0){
                System.out.println("执行成功，修改了"+result+"条数据");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}