package com.ttn.spring_boot.springBootAssignmment.entities;

public class Student {
    
    private Integer rollNo;
    private String firstName;
    private String lastName;
    private String course;
    
    public Integer getRollNo() {
        return rollNo;
    }
    
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
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
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public Student(Integer rollNo, String firstName, String lastName, String course) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }
}
