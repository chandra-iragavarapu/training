package com.training.hibernate.mappings.manytomany;

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
        TypedQuery query=session.createQuery("from Question e");    
        List<Question> list=query.getResultList();    
            
        Iterator<Question> itr=list.iterator();    
        while(itr.hasNext()){    
            Question que=itr.next();    
            System.out.println(que.getQuestion());  

            for (Answer ans: que.getAnswers()){
                System.out.println(ans.getAnswer());
            };

        }
        session.close();    
        System.out.println("success");    
    }    
}
