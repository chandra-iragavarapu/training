package com.training.hibernate.mappings.onetoonebidirectional;

import org.hibernate.*;  
 

public class InsertData {  
    
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {    
          
      sessionFactory = HibernateUtils.getSessionFactory();
      Session session=sessionFactory.openSession();  
          
      Transaction t=session.beginTransaction();   

      Department dept = new Department();
      dept.setName("Java");
      session.persist(dept);    
          
      Employee e1=new Employee();    
      e1.setName("Chandra Sekahr test");    
      e1.setEmail("chandra11@gmail.com");  
  
      e1.setDepartment(dept);
            
        // Address address1=new Address();    
        // address1.setAddressLine1("H-21,Moti nagar");    
        // address1.setCity("Hyderabad");    
        // address1.setState("AP");    
        // address1.setCountry("India");    
        // address1.setPincode(500085);    
            
        // e1.setAddress(address1);    
        // address1.setEmployee(e1);    
            
        session.persist(e1);   

        t.commit();    
            
        session.close();    
        System.out.println("success");    
    }    
    }    