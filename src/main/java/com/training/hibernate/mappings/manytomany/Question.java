package com.training.hibernate.mappings.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity  
@Table(name="question")
@Data
public class Question {
    
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int id;    
    private String question;   
  
    @ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })  
    @JoinTable(name = "question_answer",   
            joinColumns = { @JoinColumn(name = "question_id") },   
            inverseJoinColumns = { @JoinColumn(name = "answer_id") })  
    private List<Answer> answers; 
}
