package com.advanced.db;

import java.sql.*;

public class select {
    static void main() {
        Connection con=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try{
            con=ConnectionFactory.getConnection() ;
            String sql="select * from jdbc.student";
            stmt.executeQuery(sql);
//        5.操作 ResultSet 结果集
            while (rs.next()){
                String id= rs.getString("学号");
                String name=rs.getString("姓名");
                System.out.println("姓名："+name+"\t学号："+id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBClose.close(stmt, con);
        }

    }
}
