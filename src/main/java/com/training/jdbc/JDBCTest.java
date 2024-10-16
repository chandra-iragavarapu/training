package com.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;


public class JDBCTest {
    
        public static void main(String[] args) throws SQLException {
           Connection conn = DbConnection.connect();

           CallableStatement statement = conn.prepareCall("{call UpdateMobileNumber(?,?)}");

           statement.setInt(1, 2);
           statement.setString(2, "1234567890");

           statement.registerOutParameter(2, Types.VARCHAR);

           statement.execute();

           String mobile_number = statement.getString(2);
           System.out.println("Update " + mobile_number);
           statement.close();
           conn.close();
        }
        
}