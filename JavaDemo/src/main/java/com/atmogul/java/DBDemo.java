package com.atmogul.java;

import java.sql.*;

public class DBDemo {
    public static void main(String[] args) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:odbc:BookDB", " ", " ");
            Statement sql = con.createStatement();
            sql.executeUpdate("insert into Reader values ('1000001','文章','男','1987-6-26','计算机学院')");
            sql.executeUpdate("insert into Reader set  workUnit ='会计学院',where readerName = '陈真')");
            ResultSet rs = sql.executeQuery("select * from Reader");

            while (rs.next()){
                String readerName = rs.getString(2);
                String workUnit = rs.getString("workUnit");
                System.out.println(readerName);
                System.out.println(workUnit);
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
