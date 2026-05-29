package com.advanced.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {
    private static String DRIVER;
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    // 定义私有构造方法，禁止在外面创建对象
    private ConnectionFactory(){}
    static {
        getDriver();
    }
    private static void getDriver(){
        // 获取当前运行的线程对象
        Thread curThread = Thread.currentThread();
        // 获取当前线程的类加载器
        ClassLoader loader = curThread.getContextClassLoader();
        // 获取属性文件的输入流
        InputStream inStream = loader.getResourceAsStream("jdbc.properties");
        // 创建保存属性文件内容的对象
        Properties prop = new Properties();
        // 把属性文件中的内容保存到prop对象中
        try {
            prop.load(inStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 从prop对象中读取四个属性的值，赋值给四个成员变量
        DRIVER = prop.getProperty("driver");
        URL = prop.getProperty("url");
        USERNAME = prop.getProperty("username");
        PASSWORD = prop.getProperty("password");
    }
    public static final Connection getConnection(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return conn;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
