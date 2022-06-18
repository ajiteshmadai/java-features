package com.ajiteshmadai.java8.pojo;

public class Employee implements Comparable<Employee> {
    private Integer empId;
    private String name;
    private Double salary;
    public Employee(Integer empId, String name, Double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId.compareTo(o.empId);
    }
}
