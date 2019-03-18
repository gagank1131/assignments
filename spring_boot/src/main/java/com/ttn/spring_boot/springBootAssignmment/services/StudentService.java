package com.ttn.spring_boot.springBootAssignmment.services;


import com.ttn.spring_boot.springBootAssignmment.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    
    public List<Student> getStudentDetailList() {
        return Arrays.asList(
                new Student(11, "gagan", "kushwaha", "springboot"),
                new Student(12, "arpit", "gupta", "feen"),
                new Student(13, "prateek", "nagar", "devOps")
        );
    }
    
    
}
