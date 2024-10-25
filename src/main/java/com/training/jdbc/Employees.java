package com.training.jdbc;


public class Employees {

    public String getName() {
        return name;
    }

    public Employees(int id, String name, String mobile, String email) {
        this.name = name;
        this.id = id;
        this.mobile = mobile;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String mobile;

    private String email;



}
