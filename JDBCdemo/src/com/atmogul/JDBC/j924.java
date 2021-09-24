package com.atmogul.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class j924 {

    /**
     * 修改表中数据
     * @param args
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 2 获取数据库连接对象
        Connection coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");

        // 3 定义sql语句
        String sql = "update demo_user set name = 'zhangjiu' where id = 3";

        // 4 获取sql的对象
        Statement stmt = coon.createStatement();

        // 5 执行sql
        int count = stmt.executeUpdate(sql);

        // 6 处理结果
        System.out.println(count);

        // 7 释放资源
        stmt.close();
        coon.close();
    }
}
