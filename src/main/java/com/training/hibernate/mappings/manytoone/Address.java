package com.training.hibernate.mappings.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity  
@Table(name="address")
@Data
public class Address {
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int id;    
    
    private String addressLine1,city,state,country;    
    private int pincode; 

    // @OneToOne(cascade=CascadeType.ALL)  
    // private Employee employee;  
}
