package com.ttn.assignment.Question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDaoJdbcParam {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void displayUser() {
        
        
        String sql = "SELECT name FROM user WHERE dob = ?";
        
        System.out.println(jdbcTemplate.queryForObject(sql,new Object[]{"1993-12-21"},String.class));
        
        
    }
}
