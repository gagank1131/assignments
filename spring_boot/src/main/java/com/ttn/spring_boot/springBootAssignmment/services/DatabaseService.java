package com.ttn.spring_boot.springBootAssignmment.services;


import com.ttn.spring_boot.springBootAssignmment.entities.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {
    
    @Autowired
    Database database;
    String name;
    Logger logger = LoggerFactory.getLogger(DatabaseService.class);
    
    public String getConfig() {
        
        logger.info("getconfig method of DatabaseService");
        return database.getName() + " " + database.getPort();
    }
}
