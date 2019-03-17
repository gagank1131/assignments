package com.ttn.assignment.Question13d;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public class UserDao7_13_d {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = ArithmeticException.class)
    public void insert(){
        
        String sql = "INSERT INTO user(UserName,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{
                "arpit",12,"arpit",25,new Date()
        });
        
        throw new ArithmeticException();
    }
}
