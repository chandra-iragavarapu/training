package com.training.hibernate.fetch;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class NamedQuery {
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {    

       sessionFactory = HibernateUtils.getSessionFactory();
          
        
        Session session=sessionFactory.openSession();  

        // fetch query

        TypedQuery query = session.getNamedQuery("findEmployeeByName");    
        query.setParameter("name","Sekhar");    
          
        List<Employee> list2=query.getResultList(); 

        for (Employee e: list2) {
            System.out.println("Result is " + e.getName());
        }
    }
}
