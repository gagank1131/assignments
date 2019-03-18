package com.ttn.spring_boot.springBootAssignmment.controllers;

import com.ttn.spring_boot.springBootAssignmment.entities.Student;
import com.ttn.spring_boot.springBootAssignmment.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {
    
    @Autowired
    StudentService studentService;
    
    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        
        return studentService.getStudentDetailList();
    }
    
    
}
