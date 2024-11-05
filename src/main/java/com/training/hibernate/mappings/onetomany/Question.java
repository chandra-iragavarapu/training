package com.training.hibernate.mappings.onetomany;

import javax.persistence.*;

import lombok.Data;

import java.util.List;  

@Entity  
@Table(name="question") 
@Data
public class Question {
  
    @Id   
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int id;    
    private String question;    
    
    @OneToMany(cascade = CascadeType.ALL)  
    @JoinColumn(name="question_id")  
    private List<Answer> answers;  
     
}  

