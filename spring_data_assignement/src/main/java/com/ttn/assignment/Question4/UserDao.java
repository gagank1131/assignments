package com.ttn.assignment.Question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository("UserDao2")
public class UserDao {
    
    @Autowired
    SingleConnectionDataSource dataSource2;
    
public void displayUser() {
    
    try{
    Connection connection = dataSource2.getConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
    ResultSet resultSet = preparedStatement.executeQuery();
    while(resultSet.next()){
        System.out.println(resultSet.getString("name"));
    }
    }
    catch(SQLException e){
    e.printStackTrace();
    }
    
    
}

}
