package com.atmogul.java;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;

public class ConnectionDem012 {
    //定义MySQL的数据库驱动程序
    public static final String DBDRIVER = "com.mysql.jdbc.Driver";
    //定义MySQL数据库的链接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/bigdata?&useSSL=false";
    //MySQL数据库的连接用户名
    public static final String DBUSER = "root";
    //MySQL数据库的连接密码
    public static final String DBPASS = "123456";

    public static void main(String[] args) throws Exception {
        Connection con = null;  //数据库链接
        Statement stmt = null;  //数据库的操作对象
        ResultSet rs = null;  //保存查询结果
        String sql = "SELECT id,name,sex,borndate,phone,photo,boyfriend_id FROM student";

        Class.forName(DBDRIVER);  //加载驱动程序

        con = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
        stmt = con.createStatement();
        rs = stmt.executeQuery(sql);
        // stmt.execute(sql);
        // rs  Affected rows

        while (rs.next()){ //依次取出数据
            int id = rs.getInt("id");  //取出id列的内容
            String name = rs.getString("name");  //取出name列的内容
            Date borndate = rs.getDate("borndate");  //取出borndate列的内容
            String sex = rs.getString("sex");  //取出sex列的内容
            String phone = rs.getString("phone");  //取出phone列的内容
            String photo = rs.getString("photo");  //取出photo列的内容
            int boyfriendId = rs.getInt("boyfriend_id");  //取出boyfriend_id列的内容


            System.out.print("编号：" + id + ";");
            System.out.print("姓名：" + name + ";");
            System.out.print("CP编号：" + boyfriendId + ";");
            System.out.print("电话：" + phone + ";");
            System.out.print("性别：" + sex + ";");
            System.out.println("照片：" + photo + ";");
            System.out.println("生日：" + borndate + ";");
            System.out.println("****************");
        }
        rs.close();
        stmt.close();
        con.close();
    }
}
