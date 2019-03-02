package com.company.question4;

public class Student {
    
    private String name;
    private Integer studentID;
    private Integer age;
    private Long phoneNo;
    private String gender;
    private Boolean isOptedScience;
    private Boolean hasDisability;
    private String state;
    
    public Student(StudentBuilder studentBuilder) {
        name = studentBuilder.getName();
        studentID = studentBuilder.getStudentID();
        age = studentBuilder.getAge();
        phoneNo = studentBuilder.getPhoneNo();
        gender = studentBuilder.getGender();
        isOptedScience = studentBuilder.getOptedScience();
        hasDisability = studentBuilder.getHasDisability();
        state = studentBuilder.getState();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getStudentID() {
        return studentID;
    }
    
    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public Long getPhoneNo() {
        return phoneNo;
    }
    
    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public Boolean getOptedScience() {
        return isOptedScience;
    }
    
    public void setOptedScience(Boolean optedScience) {
        isOptedScience = optedScience;
    }
    
    public Boolean getHasDisability() {
        return hasDisability;
    }
    
    public void setHasDisability(Boolean hasDisability) {
        this.hasDisability = hasDisability;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                ", gender='" + gender + '\'' +
                ", isOptedScience=" + isOptedScience +
                ", hasDisability=" + hasDisability +
                ", state='" + state + '\'' +
                '}';
    }
}
