package com.ttn.assignment.Question10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UserDao10 {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

   User getUser1(){

        String sql = "SELECT * FROM user where password = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{"12345"},new UserMapper());
    }


    List<User> getUser(){

        String sql = "SELECT * FROM user where password = ?";
        return jdbcTemplate.query(sql,new Object[]{"1234"},new UserMapper());
    }



}
