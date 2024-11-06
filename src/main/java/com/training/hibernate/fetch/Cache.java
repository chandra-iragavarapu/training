package com.training.hibernate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Cache {

    private static SessionFactory sessionFactory;

    public static void main(String[] args) {    

        sessionFactory = HibernateUtils.getSessionFactory();

        Session session=sessionFactory.openSession();  

        Employee e1 = session.load(Employee.class, 29);

        System.out.println("1 st time" + e1.getName());

        session.close();

        Session session2=sessionFactory.openSession(); 

        Employee e2 = session2.load(Employee.class, 29);
        
        System.out.println("2nd time" + e2.getName());
      
    }

}