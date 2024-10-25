package com.training.hibernate.xml;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_xml")
public class Employee {

    public Employee(String name, String addr1, String email, Integer department_id) {
        this.name = name;
        this.email = email;
        this.addr1 = addr1;
        this.department_id = department_id;
    }

    public Employee() {
        
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

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

    
    private Integer department_id;

    public void setDepartmentId(Integer department) {
        this.department_id = department;
    }

    public Integer getDepartmentId(){
        return department_id;
    }

    public void setId(Integer id) {
        this.id = id;        
    }

    public Integer getId(){
        return id;
    }
    
}
