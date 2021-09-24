package com.atmogul.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class j912 {

    /**
     * 表中添加一条数据
     * @param args
     */
    public static void main(String[] args) {
        Connection coon = null;
        Statement stmt = null;

        try {
            // 1 注册驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 2 定义sql
            String sql = "insert into demo_user values(7,'wangwu','369','18965474523','452')";

            // 3 获取连接对象
            coon = DriverManager.getConnection("jdbc:mysql:///test", "root", "123456");

            // 4 获取执行sql的对象
            stmt = coon.createStatement();

            // 5 执行sql
            int count = stmt.executeUpdate(sql);

            // 6 处理结果
            System.out.println(count);
            if (count > 0){
                System.out.println("添加成功！");
            }else {
                System.out.println("添加失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (coon != null){
                try {
                    coon.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}


