package com.training.hibernate.xml;

public class TestHibernateXML {

    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create emp
        Integer insertedId1 = employeeDAO.createEmp("Emp 1", "Hyd", "a@a.com", 1);
        Integer insertedId2 = employeeDAO.createEmp("Emp 2", "hyd", "b@b.com", 1);

        employeeDAO.listEmployees();

        employeeDAO.updateEmployee(insertedId1, "Test 1 Updated");

        employeeDAO.deleteEmployee(insertedId2);

        employeeDAO.listEmployees();
    }
    
}
