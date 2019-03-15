package com.ttn.assignment.Question7_8_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDaoInsert {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    void insertUser(User user){
        
        String sql ="INSERT INTO user(UserName,password,name,age,dob) VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{
                user.getName(),user.getPassword(),user.getName(),user.getAge(),user.dob
        });
    }
    
    void displayMap(){
        String sql = "SELECT * FROM user where name = ?";
        System.out.println(jdbcTemplate.queryForMap(sql,new Object[]{"prateek1"}));
        
    }
    
    void displayList(){
        String sql = "SELECT * FROM user";
        System.out.println(jdbcTemplate.queryForList(sql));
        
    }
    
    
}
