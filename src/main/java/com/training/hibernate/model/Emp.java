package com.training.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {

    public Emp(String name, String addr1, String email, Department department) {
        this.name = name;
        this.email = email;
        this.addr1 = addr1;
        this.department = department;
    }

    public Emp() {
        
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

    @OneToOne(targetEntity=Department.class)
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment(){
        return department;
    }

    public void setId(Long id) {
        this.id = id;        
    }

    public Long getId(){
        return id;
    }
    
}
