package com.training.hibernate.annotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_annotation")
public class Employee {

    public Employee(String name, String addr1, String email, Long department_id) {
        this.name = name;
        this.email = email;
        this.addr1 = addr1;
        this.department_id = department_id;
    }

    public Employee() {
        
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    private String addr1;

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr1(){
        return addr1;
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    
    private Long department_id;

    public void setDepartmentId(Long department) {
        this.department_id = department;
    }

    public Long getDepartmentId(){
        return department_id;
    }

    public void setId(Long id) {
        this.id = id;        
    }

    public Long getId(){
        return id;
    }
    
}
