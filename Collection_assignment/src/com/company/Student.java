package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * QUESTION 5
 */

public class Student {
    
    private String name;
    private Double score;
    private Double age;
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Double getScore() {
        return score;
    }
    
    public void setScore(Double score) {
        this.score = score;
    }
    
    public Double getAge() {
        return age;
    }
    
    public void setAge(Double age) {
        this.age = age;
    }
    
    public Student(String name, Double score, Double age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }
    
    
    public static void main(String[] args) {
        
        List<Student> list = new ArrayList<Student>();
        
        list.add(new Student("gagan", 98.5, 25.0));
        list.add(new Student("arpit", 90.5, 24.0));
        list.add(new Student("lohit", 92.5, 23.0));
        list.add(new Student("aman", 92.5, 22.0));
        list.add(new Student("prateek", 97.5, 25.0));
        
        System.out.println("Before sorting...........................");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        
        list.sort((Student o1, Student o2) -> {
            
            int compareScore = o1.getScore().compareTo(o2.getScore());
            int compareName = o1.getName().compareTo(o2.getName());
            if (compareScore == 0) {
                return compareName;
            } else
                return compareScore;
        });
        
        System.out.println("After sorting...........................");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
    
}


