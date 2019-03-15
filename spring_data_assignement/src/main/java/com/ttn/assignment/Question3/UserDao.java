package com.ttn.assignment.Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {
    
    @Autowired
    DataSource dataSource;
    
    public void displayUser(){
        try {
            Connection connection = dataSource.getConnection();
        String sql;
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
