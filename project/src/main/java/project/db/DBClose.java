package project.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBClose {
    private static void close(ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            System.out.println("关闭 ResultSet 时发生错误：" + e.getMessage());
        }
    }

    // 关闭 PreparedStatement
    private static void close(PreparedStatement pstmt) {
        try {
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            System.out.println("关闭 PreparedStatement 时发生错误：" + e.getMessage());
        }
    }

    // 关闭 Connection
    private static void close(Connection conn) {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("关闭 Connection 时发生错误：" + e.getMessage());
        }
    }

    // 一次性关闭所有资源（常用）
    public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        close(rs);
        close(pstmt);
        close(conn);
        }
    public static void close(PreparedStatement pstmt, Connection conn) {
        close(pstmt);
        close(conn);
    }
}

