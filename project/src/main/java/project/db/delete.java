package project.db;

import project.db.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class delete {
    public static boolean deleteSid(String sid) {
        PreparedStatement stmt;
        try (Connection conn= ConnectionFactory.getConnection()){
            String sql = "delete jdbc.student from jdbc.student where sid=?;";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, sid);
            int result = stmt.executeUpdate();
            if (result > 0) {
                System.out.println("执行成功，修改了" + result + "条数据");
                return true;
            } else{
                return false;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }
}
