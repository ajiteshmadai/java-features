package com.ajiteshmadai.java8.pojo;

import java.util.Optional;

public class EmployeeOptional {

    private Integer empId;

    public EmployeeOptional(Integer empId, String name, String emailId, Double salary) {
        this.empId = empId;
        this.name = name;
        this.emailId = Optional.ofNullable(emailId);
        this.salary = salary;
    }

    private String name;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = Optional.ofNullable(emailId);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    private Optional<String> emailId;
    private Double salary;
}
