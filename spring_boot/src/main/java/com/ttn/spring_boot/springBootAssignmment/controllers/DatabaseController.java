package com.ttn.spring_boot.springBootAssignmment.controllers;


import com.ttn.spring_boot.springBootAssignmment.services.DatabaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatabaseController {
    
    
    @Autowired
    DatabaseService databaseService;
    
    String name;
    Logger logger = LoggerFactory.getLogger(DatabaseController.class);
    @RequestMapping("/dbConfig")
    public String dbConfig(){
        
        logger.info("now going to call database service..");
        return databaseService.getConfig();
    }
}
