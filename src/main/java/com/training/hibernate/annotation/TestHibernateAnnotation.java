package com.training.hibernate.annotation;

import java.util.List;

public class TestHibernateAnnotation {
    public static void main(String[] args) {

       EmployeeDAO empDAO = new EmployeeDAO();

       empDAO.createEmp("Emp 1", "Hyd", "a@a.com", Long.valueOf(1));
        
       List<Employee> empList = empDAO.getEmployeeList();
       for(Employee e: empList) {
        System.out.println(e.getName());
        
        
    }
}
}
