package com.training.hibernate.mappings.onetoonebidirectional;

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
        TypedQuery query=session.createQuery("From Employee e");    
        List<Employee> list=query.getResultList();    
            
        Iterator<Employee> itr=list.iterator();    
        while(itr.hasNext()){    
            Employee emp=itr.next();    
            System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail());  

            Department dept = emp.getDepartment();
            System.out.println(dept.getId()+" "+dept.getName());

        }

        // Department

        System.out.println("Department Data");

        TypedQuery query1=session.createQuery("From Department d");    
        List<Department> list1=query1.getResultList();    
            
        Iterator<Department> itr1=list1.iterator();    
        while(itr1.hasNext()){    
            Department dept=itr1.next();    
            System.out.println(dept.getId()+" "+dept.getName());

            Employee emp = dept.getEmployee();
            System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail());  

        }
        session.close();    
        System.out.println("success");    
    }    
}
