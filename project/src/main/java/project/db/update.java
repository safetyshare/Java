package project.db;

import project.db.ConnectionFactory;
import project.bean.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    public static boolean Update(Student student) {
        PreparedStatement stmt;
        try (Connection connection= ConnectionFactory.getConnection()){
            String sql = "update jdbc.student set sname=?,sclass=?,address=?,teleNumber=?,QQ=? where sid=?;";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,student.getSname());
            stmt.setString(2,student.getSclass());
            stmt.setString(3,student.getAddress());
            stmt.setString(4, student.getTeleNumber());
            stmt.setString(5,student.getQQ());
            stmt.setString(6,student.getSid());
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("执行成功，修改了" + result + "条数据");
                return true;
            }else  {
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
