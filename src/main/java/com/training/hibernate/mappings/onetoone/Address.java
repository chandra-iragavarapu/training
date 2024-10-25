package com.training.hibernate.mappings.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="address")
@Data
public class Address {  

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private int id;  

    private String addressLine1,city,state,country;  

    private int pincode;  


}  
