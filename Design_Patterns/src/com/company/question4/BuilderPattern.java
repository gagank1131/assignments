package com.company.question4;

public class BuilderPattern {
    public static void main(String[] args) {
        
        Student student = new StudentBuilder("gagan",3307)
                .setAge(25)
                .setGender("male")
                .OptedScience(true)
                .HasDisability(false)
                .setPhoneNo(9654485661L)
                .setState("delhi")
                .build();
    
        System.out.println(student);
    }
}
