package com.ajiteshmadai.java8.lamda;

import com.ajiteshmadai.java8.pojo.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingComparator {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ajitesh", 12345d);
        Employee e2 = new Employee(5, "pogo", 567567567d);
        Employee e3 = new Employee(3, "zuru", 9878234d);
        Employee e4 = new Employee(2, "aishu", 3434534d);
        List<Employee> employees = Arrays.asList(e1, e2, e3, e4);
        System.out.println("Default Sorting :");
        employees.stream()
                .sorted()
                .forEach(System.out::println);

        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);

        System.out.println("Sorting using Name Comparator :");
        employees.stream()
                .sorted(nameComparator)
                .forEach(System.out::println);

        Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);
        System.out.println("Sorting using Salary Comparator :");
        employees.stream()
                .sorted(salaryComparator)
                .forEach(System.out::println);

    }
}
