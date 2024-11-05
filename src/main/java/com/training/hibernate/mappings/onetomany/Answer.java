package com.training.hibernate.mappings.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="answers")
@Data
public class Answer {

    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int id;   

    private String answer;    
    private String answeredBy;  
}
