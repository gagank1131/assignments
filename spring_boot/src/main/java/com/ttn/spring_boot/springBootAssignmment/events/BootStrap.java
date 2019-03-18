package com.ttn.spring_boot.springBootAssignmment.events;

import com.ttn.spring_boot.springBootAssignmment.entities.Students;
import com.ttn.spring_boot.springBootAssignmment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class BootStrap {
    
    @Autowired
    StudentRepository studentRepository;
    
    @EventListener(ContextRefreshedEvent.class)
    public void insert(){
    
        Iterator<Students> studentsIterator = studentRepository.findAll().iterator();
        
        if(!(studentsIterator.hasNext())){
            for (int i=0;i<5;i++){
                Students students = new Students(i+1,"student"+i,"JVM");
                studentRepository.save(students);
            }
        }
        
    }
    
    
}
