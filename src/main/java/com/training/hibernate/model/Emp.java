package com.training.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {

    public Emp(String name, String addr1, String email, int departmentId) {
        this.name = name;
        this.email = email;
        this.addr1 = addr1;
        this.department_id = departmentId;
    }

    public Emp() {
        
    }

    private int id;

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

    private int department_id;

    public void setDepartmentId(int departmentId) {
        this.department_id = departmentId;        
    }

    public int getDepartmentId(){
        return department_id;
    }

    public void setId(int id) {
        this.id = id;        
    }

    public int getId(){
        return id;
    }
    
}
