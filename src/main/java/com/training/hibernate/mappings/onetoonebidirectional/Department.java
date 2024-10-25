package com.training.hibernate.mappings.onetoonebidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="depatment")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    private Long id;

    private String name;

    @OneToOne(mappedBy = "department")
    private Employee employee;

}
