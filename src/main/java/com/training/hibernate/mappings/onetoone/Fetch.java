package com.training.hibernate.mappings.onetoone;

import java.util.*;  
import javax.persistence.TypedQuery;  
import org.hibernate.Session;    
import org.hibernate.SessionFactory;  


public class Fetch {

    private static SessionFactory sessionFactory;
    public static void main(String[] args) {    

       sessionFactory = HibernateUtils.getSessionFactory();
          
        
        Session session=sessionFactory.openSession();  
            
        @SuppressWarnings("rawtypes")
        TypedQuery query=session.createQuery("from Employee e");    
        List<Employee> list=query.getResultList();    
            
        Iterator<Employee> itr=list.iterator();    
        while(itr.hasNext()){    
            Employee emp=itr.next();    
            System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail());  

            Department dept = emp.getDepartment();
            System.out.println(dept.getId()+" "+dept.getName());

        }
        session.close();    
        System.out.println("success");    
    }    
}
