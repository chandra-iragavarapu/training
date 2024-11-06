package com.training.hibernate.fetch;

import java.util.List;

import javax.persistence.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

// Hibernate Query Language
public class HQL {

    private static SessionFactory sessionFactory;
    public static void main(String[] args) {    

       sessionFactory = HibernateUtils.getSessionFactory();
          
        
        Session session=sessionFactory.openSession();  

        // fetch query

        Query query2=session.createQuery("from Employee ");  
          
        List<Employee> list2=query2.getResultList(); 

        for (Employee e: list2) {
            System.out.println("Fetch Query is" + e.getName());
        }

        // Pagination
            
        // Query query=session.createQuery("from Employee ");  
        // query.setFirstResult(0);  
        // query.setMaxResults(1);    
        // List<Employee> list=query.getResultList(); 

        // for (Employee e: list) {
        //     System.out.println("Fetch with pagination" +e.getName());
        // }


        // Update
        Transaction tx=session.beginTransaction(); 
        Query q=session.createQuery("update Employee set name=:n where id=:i");  
        q.setParameter("n","Test 123");  
        q.setParameter("i",29);  
  
        int status=q.executeUpdate();  
        System.out.println(status);  
        tx.commit(); 
        Query query1=session.createQuery("from Employee ");  
        List<Employee> list1=query1.getResultList(); 

        for (Employee e: list1) {
            System.out.println("After update"+ e.getName());
        }


        // Delete
        // Transaction tx2=session.beginTransaction();
        // Query query3=session.createQuery("delete from Employee where id=29");  
        // query3.executeUpdate();  
        // tx2.commit();
        // Query query5=session.createQuery("from Employee ");  
        // List<Employee> list5=query5.getResultList(); 

        // for (Employee e: list5) {
        //     System.out.println("After delete"+ e.getName());
        // }
         
        session.close();    



        System.out.println("success"); 
    
    }
}
