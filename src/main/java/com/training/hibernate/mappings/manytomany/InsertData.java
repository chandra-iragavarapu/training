package com.training.hibernate.mappings.manytomany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.*;  
 

public class InsertData {  
    
    private static SessionFactory sessionFactory;

    public static void main(String[] args) {    
          
      sessionFactory = HibernateUtils.getSessionFactory();
      Session session=sessionFactory.openSession();  
          
      Transaction t=session.beginTransaction();   

      Answer ans1=new Answer();    
      ans1.setAnswer("AWS");    
      ans1.setAnsweredBy("Chandra");    
        
      Answer ans2=new Answer();    
      ans2.setAnswer("GCP");    
      ans2.setAnsweredBy("Sekahr");    
          
      Answer ans3=new Answer();    
      ans3.setAnswer("MYSQL");    
      ans3.setAnsweredBy("Chandra");    
          
      Answer ans4=new Answer();    
      ans4.setAnswer("MSSQL");    
      ans4.setAnsweredBy("Sekhar");    
          
      ArrayList<Answer> list1=new ArrayList<Answer>();    
      list1.add(ans1);    
      list1.add(ans2);    
          
      ArrayList<Answer> list2=new ArrayList<Answer>();    
      list2.add(ans3);    
      list2.add(ans4);    
          
      Question question1=new Question();    
      question1.setQuestion("What are the cloud platforms you are aware?");    
      question1.setAnswers(list1);    
          
      Question question2=new Question();    
      question2.setQuestion("What are the databases you are aware?");    
      question2.setAnswers(list2);    
          
      session.persist(question1);    
      session.persist(question2);    
            
      t.commit(); 
      
      session.close();    
      System.out.println("success");    
    }    
}    