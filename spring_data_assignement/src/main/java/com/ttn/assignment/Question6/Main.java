package com.ttn.assignment.Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
       UserDaoJdbcParam userDaoJdbcParam =  applicationContext.getBean(UserDaoJdbcParam.class);
       
       userDaoJdbcParam.displayUser();
    }
}
