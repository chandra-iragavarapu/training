package com.training.hibernate.fetch;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

import org.hibernate.annotations.Cache;  
import org.hibernate.annotations.CacheConcurrencyStrategy;

@NamedQueries(  
    {  
        @NamedQuery(  
        name = "findEmployeeByName",  
        query = "from Employee e where e.name = :name"  
        )  
    }  
)
@Entity
@Table(name="employee")
@Data
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class Employee {
 
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;  

        private String name,email; 

}  

