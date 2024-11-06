package com.training.hibernate.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.criteria.CriteriaQuery;

// Hibernate Criteria Query Language
public class HCQL {

    private static SessionFactory sessionFactory;
    public static void main(String[] args) {    

        sessionFactory = HibernateUtils.getSessionFactory();
          
        Session session=sessionFactory.openSession(); 

        // create Criteria
        CriteriaQuery<Employee> criteriaQuery = session.getCriteriaBuilder().createQuery(Employee.class);
        criteriaQuery.from(Employee.class);

        List<Employee> emps = session.createQuery(criteriaQuery).getResultList();
        for (Employee e: emps) {
            System.out.println("Empl Name is " + e.getName());
        }
        session.close();
        
    }
    
}
