package com.techelevator;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private double annualSalary;

    //setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    //getters
    public int getEmployeeId() {
        return this.employeeId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getDepartment() {
        return this.department;
    }
    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public Employee(int setEmployeeId, String setFirstName, String setLastName, double setSalary){
        this.employeeId = setEmployeeId;
        this.annualSalary = setSalary;
        this.lastName = setLastName;
        this.firstName = setFirstName;
        this.fullName = this.lastName + ", " + this.firstName ;
    }

    public void raiseSalary(double percent){
        this.annualSalary = this.annualSalary * (1 + .01*percent);
    }

}
