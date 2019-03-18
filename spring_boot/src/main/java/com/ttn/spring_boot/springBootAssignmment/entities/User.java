package com.ttn.spring_boot.springBootAssignmment.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
    
    private String userName;
    private String password;
    
    Logger logger = LoggerFactory.getLogger(User.class);
    
    public User() {
        logger.info("Bean is created.....");
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
