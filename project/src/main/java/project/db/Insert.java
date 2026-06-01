package project.db;

import project.db.ConnectionFactory;
import project.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static boolean insert(Student student){
        PreparedStatement stmt;
        try (Connection conn= ConnectionFactory.getConnection()){
            String sql = "insert into jdbc.student(sid,sname,sclass,address,teleNumber,QQ) values (?,?,?,?,?,?);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,student.getSid());
            stmt.setString(2,student.getSname());
            stmt.setString(3,student.getSclass());
            stmt.setString(4,student.getAddress());
            stmt.setString(5, student.getTeleNumber());
            stmt.setString(6,student.getQQ());
            int result=stmt.executeUpdate();
            if (result>0){
                System.out.println("执行成功，修改了"+result+"条数据");
                return true;
            }else {return false;}
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}