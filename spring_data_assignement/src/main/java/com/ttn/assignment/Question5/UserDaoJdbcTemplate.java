package com.ttn.assignment.Question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDaoJdbcTemplate {
    
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void displayCount(){
        String sql = "Select count(*) from user";
        System.out.println(jdbcTemplate.queryForObject(sql,Integer.class));
        
        
    }
    
    
}
