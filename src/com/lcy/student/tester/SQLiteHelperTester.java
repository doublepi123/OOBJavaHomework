package com.lcy.student.tester;

import com.lcy.student.util.SQLiteHelper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLiteHelperTester {

    public static void main(String[] args) {
        SQLiteHelper sqLiteHelper = new SQLiteHelper();
        sqLiteHelper.executeUpdate("CREATE TABLE IF NOT EXISTs STUDENTINFO(ID CHAR(10) , NAME VARCHAR(10), AGE INT);");
        sqLiteHelper.executeUpdate("INSERT INTO STUDENTINFO VALUES(1811130204,'LCY',99)");
        ResultSet rs =  sqLiteHelper.executeQuery("SELECT * FROM STUDENTINFO");
        try{
            while (rs.next()){
                System.out.println(rs.getString("NAME"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
