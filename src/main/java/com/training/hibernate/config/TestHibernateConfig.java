package com.training.hibernate.config;

import java.util.List;

import com.training.hibernate.model.Emp;

public class TestHibernateConfig {
    public static void main(String[] args) {

       EmpDAO empDAO = new EmpDAO();
       List<Emp> empList = empDAO.getEmployList();
       for(Emp e: empList) {
        System.out.println(e.getName());
       }
        
    }
}
