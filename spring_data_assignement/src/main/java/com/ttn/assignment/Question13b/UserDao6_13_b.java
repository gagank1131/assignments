package com.ttn.assignment.Question13b;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao6_13_b {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    UserDao7_13_b userDao713a;
    
    @Transactional(propagation = Propagation.REQUIRED)
 public void insert(){
     
     String sql = "INSERT INTO user(UserName,password,name,age,dob)VALUES(?,?,?,?,?)";
     jdbcTemplate.update(sql,new Object[]{
             "gagan",12,"gagan",25,new Date()
     });
     
     try{
     userDao713a.insert();
     
     }
     catch(RuntimeException e){
     
     }
 }
 
}
