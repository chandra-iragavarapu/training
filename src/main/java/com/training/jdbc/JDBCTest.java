package com.training.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest {
    
        public static void main(String[] args) throws SQLException {

            String insertSQL = "INSERT INTO employee_jdbc (name, mobile, email) VALUES (?,?,?)";
            Connection conn = DbConnection.connect();
            PreparedStatement psmt = conn.prepareStatement(insertSQL);
            psmt.setString(1, "Chandra");
            psmt.setString(2, "2929292929");
            psmt.setString(3, "a@a.com");
            psmt.execute();
            psmt.close();
            conn.close();
        }
        
}