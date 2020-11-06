package com.luofei.informal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
    private static final String DN="com.mysql.jdbc.Driver";
    private static final String url="jdbc:mysql://localhost:3306/test";
    private static final String user="root";
    private static final String password="123456";

    static {
        try {
            Class.forName(DN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }
}
