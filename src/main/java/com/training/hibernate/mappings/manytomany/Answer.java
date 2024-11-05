package com.training.hibernate.mappings.manytomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity  
@Table(name="answer")
@Data
public class Answer {
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int id;    
    private String answer;    
    private String answeredBy;  
}
