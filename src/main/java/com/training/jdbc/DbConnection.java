package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static final String url ="jdbc:mysql://127.0.0.1:3306/training?autoReconnect=true&useSSL=false";
    private static final String username = "root";
    private static final String password = "";

    public static Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username,password);

            if(conn != null ){
                System.out.println(" Conencted to my local Mysql db  " );
            } else {
                System.out.println(" Failed to connect mysql db " );
            }

        } catch (SQLException sqlexception) {
            System.out.println("sqlexception = " + sqlexception);
        }

        return conn;

    }
}
