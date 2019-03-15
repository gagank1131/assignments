package com.ttn.assignment.Question12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Date;

@Repository
public class UserDao6 {
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Autowired
    UserDao7 userDao7;
    
    @Transactional(propagation = Propagation.REQUIRED)
    public void insert() {
        String sql = "INSERT INTO user (UserName,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                "abc", "abc", "abc", 2, new Date()
        });
        
           try{
            
            userDao7.insert();
            
           }
           catch(ArithmeticException e){
          
           }
        
    }
    
    
}
