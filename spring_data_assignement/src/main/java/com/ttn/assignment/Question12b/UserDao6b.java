package com.ttn.assignment.Question12b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao6b {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    UserDao7b userDao7b;
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert(){
        
        String sql = "INSERT INTO user (UserName,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{
                "gagan",123,"gagan",24, new Date()
        });
    
        
  try{
    userDao7b.insert();
    
  }
  catch(RuntimeException e){
  
  }
    
    }
    
}
