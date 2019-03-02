package com.company.question4;

public class StudentBuilder {
    
    private String name;
    private Integer studentID;
    private Integer age;
    private Long phoneNo;
    private String gender;
    private Boolean isOptedScience;
    private Boolean hasDisability;
    private String state;
    
    public StudentBuilder(String name, Integer studentID) {
        this.name = name;
        this.studentID = studentID;
       
    }
    
    public String getName() {
        return name;
    }
    
    
    
    public Integer getStudentID() {
        return studentID;
    }
    
 
    
    public Integer getAge() {
        return age;
    }
    
    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }
    
    public Long getPhoneNo() {
        return phoneNo;
    }
    
    public StudentBuilder setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    
    public String getGender() {
        return gender;
    }
    
    public StudentBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }
    
    public Boolean getOptedScience() {
        return isOptedScience;
    }
    
    public StudentBuilder OptedScience(Boolean optedScience) {
        isOptedScience = optedScience;
        return this;
    }
    
    public Boolean getHasDisability() {
        return hasDisability;
    }
    
    public StudentBuilder HasDisability(Boolean hasDisability) {
        this.hasDisability = hasDisability;
        return this;
    }
    
    public String getState() {
        return state;
    }
    
    public StudentBuilder setState(String state) {
        this.state = state;
        return this;
    }
    
    public Student build(){
        return new Student(this);
    }
}
