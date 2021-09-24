package com.atmogul.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
* 需求：
1. 通过键盘录入用户名和密码
2. 判断用户是否登录成功
    * select * from user where username = "" and password = "";
    * 如果这个sql有查询结果，则成功，反之，则失败
 */
public class j951 {

    public static void main(String[] args) {
        
        // 1 键盘输入，接受用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        
        // 2 调用方法
        boolean flag = new j951().login(username, password);

        // 3 判断结果，输出不同语句
        if (flag){
            System.out.println("登录成功！");
        }else {
            System.out.println("用户们或密码错误！");
        }
    }

    /**
     * 登录方法
     */
    public boolean login(String username,String password){
        if (username == null || password == null){
            return false;
        }

        // 连接数据库判断是否登录成功
        Connection coon = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1 获取连接
            coon = JDBCUtils.getConnection();
            // 2 定义SQL
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"' ";
            // 3 获取执行sql的对象
            stmt = coon.createStatement();
            // 4 执行查询
            rs = stmt.executeQuery(sql);
            // 5 判断
            return rs.next(); // 如果有下一行，则返回true
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,coon);
        }
        return false;
    }
}
