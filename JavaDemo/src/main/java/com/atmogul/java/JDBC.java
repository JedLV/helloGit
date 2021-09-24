package com.atmogul.java;

import java.sql.*;

public class JDBC {
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    public static final String DBURL = "jdbc:mysql://localhost:3306/bigdata?&useSSL=false";
    public static final String DBUSER = "root";
    public static final String DBPASSWORD = "123456";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con = null;  //数据库链接
        Statement state = null;  //数据库的操作对象
        ResultSet rs = null;  //保存查询结果
        String sql = "select id,name,age,sex,adress,phone from student";
        Class.forName(DBDRIVER);
        // 1) 创建连接对象
          con = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
        // 2) 创建 Statement 语句对象
          state = con.createStatement();
        // 3) 执行 SQL 语句
          rs = state.executeQuery(sql);

        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String age = rs.getString("age");
            String sex = rs.getString("sex");
            String adress = rs.getString("adress");
            String phone = rs.getString("phone");

            System.out.println("编号" + id);
            System.out.println("名字" + name);
            System.out.println("年龄" + age);
            System.out.println("性别" + sex);
            System.out.println("地址" + adress);
            System.out.println("电话" + phone);
        }
        rs.close();
        state.close();
        con.close();
    }
}
