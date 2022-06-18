package com.ajiteshmadai.java8.optional;

import com.ajiteshmadai.java8.pojo.EmployeeOptional;

public class OptionalCheck {
    public static void main(String[] args) {
        EmployeeOptional emp1 = new EmployeeOptional(1, "abcd", "abcd@org.com", 50000d );
        EmployeeOptional emp2 = new EmployeeOptional(1, "abcd", null, 50000d );

        System.out.println("Employee1 Email: " + emp1.getEmailId().map(String::toLowerCase).orElse("Email not provided"));
        System.out.println("Employee2 Email: " + emp2.getEmailId().map(String::toLowerCase).orElse("Email not provided"));
    }
}
