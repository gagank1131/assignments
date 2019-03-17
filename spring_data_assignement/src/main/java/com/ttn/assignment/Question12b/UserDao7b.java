package com.ttn.assignment.Question12b;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao7b {
    
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert(){
        String sql = "INSERT INTO user(UserName,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{
                "arpit",1234,"arpit",23, new Date()
        });
        
        
        throw new RuntimeException();
        
     
    }
}
