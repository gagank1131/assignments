package com.springdata.entity;

import javax.persistence.*;

@Entity
@Table(name = "person")
@NamedNativeQuery(name = "Person.findByNameIs",
        query = "SELECT * from person where firstName=:name",
        resultClass = Person.class)
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String firstName;

  private String lastName;

  private Integer salary;

  private Integer age;

  public Person() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Person(String firstName, String lastName, Integer salary, Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{"
        + "id="
        + id
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", salary="
        + salary
        + ", age="
        + age
        + '}';
  }
}
