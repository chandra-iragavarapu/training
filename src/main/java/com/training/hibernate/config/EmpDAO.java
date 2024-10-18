package com.training.hibernate.config;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.training.hibernate.model.Emp;

public class EmpDAO {

    public List <Emp> getEmployList() {
       // Transaction tx = null;
        List<Emp> empList = new ArrayList<>();
        try {
            System.out.println("hfhfhfh");
            Session session = HibernateUtils.getSessionFactory().openSession();           
           // tx = session.beginTransaction();
           System.out.println("hi" + session.toString());
            empList = session.createQuery("FROM Emp", Emp.class).list();
             
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return empList;
    }
    
}
