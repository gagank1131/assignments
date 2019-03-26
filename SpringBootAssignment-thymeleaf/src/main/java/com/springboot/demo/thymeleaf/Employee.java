package com.springboot.demo.thymeleaf;

public class Employee {

  String name;
  String email;
  int age;
  boolean isAdmin;

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }

  public Employee() {}


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Employee(String name, String email, int age, boolean isAdmin) {
    this.name = name;
    this.email = email;
    this.age = age;
    this.isAdmin = isAdmin;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", age=" + age +
            ", isAdmin=" + isAdmin +
            '}';
  }
}
