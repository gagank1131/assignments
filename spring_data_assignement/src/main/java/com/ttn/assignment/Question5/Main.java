package com.ttn.assignment.Question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
       UserDaoJdbcTemplate userDaoJdbcTemplate =  applicationContext.getBean("userDaoJdbcTemplate",UserDaoJdbcTemplate.class);
       
       userDaoJdbcTemplate.displayCount();
    }
}
