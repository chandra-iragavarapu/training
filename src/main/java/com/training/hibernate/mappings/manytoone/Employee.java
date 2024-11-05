package com.training.hibernate.mappings.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity  
@Table(name="employee")
@Data
public class Employee {
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)    
    private int id;    
    
    private String name,email;    
    
    @ManyToOne(cascade=CascadeType.ALL)  
    private Address address;  
}
