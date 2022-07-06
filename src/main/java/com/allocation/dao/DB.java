


package com.allocation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/allocation";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    private DB() {
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if(conn == null) {
            new DB();
        }

        return conn;
    }
}



            