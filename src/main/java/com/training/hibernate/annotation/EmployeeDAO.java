package com.training.hibernate.annotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDAO {

    public List <Employee> getEmployeeList() {
       // Transaction tx = null;
        List<Employee> empList = new ArrayList<>();
        try {
            Session session = HibernateUtils.getSessionFactory().openSession();
           // tx = session.beginTransaction();
            empList = session.createQuery("FROM Employee", Employee.class).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return empList;
    }

     public Long createEmp(String name, String addr1, String email, Long departmentId) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx = null;
        Long createdId = null;
        try {
            tx = session.beginTransaction();
            Employee emp = new Employee(name, addr1, email, departmentId);
            createdId = (Long) session.save(emp);
            tx.commit();
        } catch (HibernateException e) {
            if(tx!= null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return createdId;
    }
    
}
