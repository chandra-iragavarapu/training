package com.training.jdbc;

import java.sql.Connection;

public class JDBCTest {
    
        public static void main(String[] args)  {
           Connection conn = DbConnection.connect();
        }
        
}