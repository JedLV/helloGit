package com.atmogul.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class j580 {
    public static void main(String[] args) {
        Connection coon = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            // 1 获取连接
            coon = JDBCUtils.getConnection();
            // 开启事务
            coon.setAutoCommit(false);

            // 2定义sql
            //2.1 张三 - 500
            String sql1 = "update demo_user set phone = phone - ? where id = ?";
            //2.2 李四 + 500
            String sql2 = "update demo_user set phone = phone + ? where id = ?";

            // 3 获取执行sql对象
            pstmt1 = coon.prepareStatement(sql1);
            pstmt2 = coon.prepareStatement(sql2);

            // 4 设置参数
            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);

            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,1);

            // 5 执行sql
            pstmt1.executeLargeUpdate();
            // 手动制作异常
            int i = 3/0;

            pstmt2.executeLargeUpdate();

            // 提交事务
            coon.commit();
        } catch (SQLException e) {
            //事务回滚
            try {
                if(coon != null) {
                    coon.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,coon);
            JDBCUtils.close(pstmt2,null);
        }



    }
}
