package com.training.hibernate.mappings.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {
 
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;  

        private String name,email; 

        @JoinColumn(name = "department_id")
        @OneToOne
        private Department department;  

}  

