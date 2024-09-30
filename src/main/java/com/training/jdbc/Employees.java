package com.training.jdbc;


public class Employees {

    public String getName() {
        return name;
    }

    public Employees(int id, String name, String mobile_number, String email) {
        this.name = name;
        this.id = id;
        this.mobile_number = mobile_number;
        this.email = email;
    }

    public Employees(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String mobile_number;

    private String email;



}
