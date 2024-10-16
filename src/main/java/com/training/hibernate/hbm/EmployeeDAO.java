package com.training.hibernate.hbm;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.training.hibernate.model.Emp;

public class EmployeeDAO {
    
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {

        sessionFactory = new Configuration().configure().buildSessionFactory();

        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create emp
        //  Integer insertedId1 = employeeDAO.createEmp("Emp 1", "Hyd", "a@a.com", 1);
        // Integer insertedId2 = employeeDAO.createEmp("Emp 2", "hyd", "b@b.com", 1);

       // employeeDAO.listEmployees();

        // employeeDAO.updateEmployee(1, "Test 1 Updated");

        employeeDAO.deleteEmployee(2);

        employeeDAO.listEmployees();
    }

    public void deleteEmployee(Integer empId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Emp emp = (Emp) session.get(Emp.class, empId);
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
            Emp emp = (Emp) session.get(Emp.class, empId);
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
            List empList = session.createQuery("FROM Emp").list();

            for(Iterator iterator = empList.iterator(); iterator.hasNext();) {
               Emp e =  (Emp) iterator.next();
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

    public int createEmp(String name, String addr1, String email, int departmentId) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Integer createdId = null;
        try {
            tx = session.beginTransaction();
            Emp emp = new Emp(name, addr1, email, departmentId);
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
