package project.db;

import project.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class select {
    @SuppressWarnings("rawtypes")
    public static List selectall() {
        List<Student> studentList = new ArrayList<>();
        try(Connection con= ConnectionFactory.getConnection()){
            String sql="select * from jdbc.student";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery();
//        5.操作 ResultSet 结果集
            while (rs.next()){
                Student student = new Student(
                        rs.getString("sid"),
                        rs.getString("sname"),
                        rs.getString("sclass"),
                        rs.getString("address"),
                        rs.getString("teleNumber"),
                        rs.getString("QQ")
                );
                studentList.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return studentList;
    }
    public static Student selectStudentBySID(String sid) {
        Student student = null;
        try(Connection con= ConnectionFactory.getConnection()){
            String sql="select * from jdbc.student where sid=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,sid);
            ResultSet rs=stmt.executeQuery();
//        5.操作 ResultSet 结果集
            while (rs.next()){
                student = new Student(
                    rs.getString("sid"),
                    rs.getString("sname"),
                    rs.getString("sclass"),
                    rs.getString("address"),
                    rs.getString("teleNumber"),
                    rs.getString("QQ")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return student;
    }
    @SuppressWarnings("rawtypes")
    public static List selectStudentByName(String sname) {
        List<Student> studentList = new ArrayList<>();
        try(Connection con= ConnectionFactory.getConnection()){
            String sql="select * from jdbc.student where sname=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,sname);
            ResultSet rs=stmt.executeQuery();
//        5.操作 ResultSet 结果集
            while (rs.next()){
                Student student = new Student(
                        rs.getString("sid"),
                        rs.getString("sname"),
                        rs.getString("sclass"),
                        rs.getString("address"),
                        rs.getString("teleNumber"),
                        rs.getString("QQ")
                );
                studentList.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}
