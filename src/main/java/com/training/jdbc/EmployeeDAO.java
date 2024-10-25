package com.training.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employees> findAll() {

        List<Employees> employeeList = new ArrayList<Employees>();

        Connection conn = DbConnection.connect();
        String sql = "select id, name, email, mobile from employees";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                Employees employees = new Employees(rs.getInt("id"), rs.getString("name"),
                        rs.getString("email"), rs.getString("mobile"));
                employeeList.add(employees);
               // employeeList.add(rs.getString("name"));
            }
        } catch (SQLException e){
            System.out.println("e = " + e);
        }

        return employeeList;

    }

    public static Employees findById(int id){
        Employees emp = null;

        Connection conn = DbConnection.connect();

        String sql = "select id, name from employees where id = ?";


        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                emp = new Employees(rs.getInt("id"), rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return emp;
    }


}
