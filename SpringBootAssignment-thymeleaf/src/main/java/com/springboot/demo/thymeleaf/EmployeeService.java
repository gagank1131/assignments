package com.springboot.demo.thymeleaf;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

  public List<Employee> getEmployeeList() {

    return Arrays.asList(
        new Employee("gagan", "gagan.kushwaha@gmail.com", 24, true),
        new Employee("arpit", "arpit@gmail.com", 21, false),
        new Employee("Prateek", "prateek@gmail.com", 22, true),
        new Employee("Lohit", "lohit@gmail.com", 23, false));
  }

  public Employee getEmployee() {
    return new Employee("gagan", "kushwaha", 24, true);
  }
}
