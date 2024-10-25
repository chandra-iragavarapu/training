package com.training.hibernate.xml;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
    
    private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public void deleteEmployee(Integer empId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee emp = (Employee) session.get(Employee.class, empId);
            session.delete(emp);
            tx.commit();          
        } catch (HibernateException e) {
            if(tx!= null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateEmployee(Integer empId, String name) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee emp = (Employee) session.get(Employee.class, empId);
            emp.setName(name);
            session.update(emp);
            tx.commit();          
        } catch (HibernateException e) {
            if(tx!= null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
    public void listEmployees() {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List<?> empList = session.createQuery("FROM Employee").list();

            for(@SuppressWarnings("rawtypes")
            Iterator iterator = empList.iterator(); iterator.hasNext();) {
               Employee e =  (Employee) iterator.next();
               System.out.println("Name is" + e.getName());
            }
            tx.commit();
        } catch (HibernateException e) {
            if(tx!= null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Integer createEmp(String name, String addr1, String email, Integer departmentId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Integer createdId = null;
        try {
            tx = session.beginTransaction();
            Employee emp = new Employee(name, addr1, email, 1);
            createdId = (Integer) session.save(emp);
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
