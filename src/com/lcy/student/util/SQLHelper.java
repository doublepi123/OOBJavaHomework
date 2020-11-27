package com.lcy.student.util;

import java.sql.*;

public class SQLHelper {
    private static final String driver =  "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://sh.gxu.icu/java_homework?useSSL=false";
    private static final String user = "root";
    private static final String password = "lcyzuishuai";
    private Connection conn = null;
    private Statement stmt = null;

    public SQLHelper() {
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();                            //创建语句
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rs;

    }

    public int executeUpdate(String sql){
        int res = 0;
        try {
            res = stmt.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return res;
    }
}
