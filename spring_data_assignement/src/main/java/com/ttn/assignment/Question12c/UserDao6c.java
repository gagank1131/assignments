package com.ttn.assignment.Question12c;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao6c {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    UserDao7c userDao7c;
    
    @Transactional(propagation = Propagation.NESTED)
 public void insert(){
     
     String sql = "INSERT INTO user(UserName,password,name,age,dob)VALUES(?,?,?,?,?)";
     jdbcTemplate.update(sql,new Object[]{
             "gagan",12,"gagan",25,new Date()
     });
     
     try{
     userDao7c.insert();
     
     }
     catch(RuntimeException e){
     
     }
 }
 
}
