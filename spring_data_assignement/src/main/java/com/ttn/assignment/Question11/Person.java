package com.ttn.assignment.Question11;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    
    @Id
    Integer id;
    
    String name;
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}