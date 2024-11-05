package com.training.hibernate.mappings.manytoone;

import org.hibernate.*;  
 
public class InsertData {  
    
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {    
          
      sessionFactory = HibernateUtils.getSessionFactory();
      Session session=sessionFactory.openSession();  
          
      Transaction t=session.beginTransaction();   

      Employee e1=new Employee();    
      e1.setName("Chandra");    
      e1.setEmail("chandra@gmail.com");    
        
      Employee e2=new Employee();  
      e2.setName("Sekhar");  
      e2.setEmail("sekhar@gmail.com");  
          
      Address address1=new Address();    
      address1.setAddressLine1("HIG 224");    
      address1.setCity("Hyderabad");    
      address1.setState("AP");    
      address1.setCountry("India");    
      address1.setPincode(500085);    
          
      e1.setAddress(address1);    
      e2.setAddress(address1);  
    
      session.persist(e1);    
      session.persist(e2);  
      t.commit();    
      
      session.close();    
      System.out.println("success");    
    }    
}    