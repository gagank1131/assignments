package com.ttn.assignment.Question4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
    
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
    UserDao userDao =   applicationContext.getBean("UserDao2",UserDao.class);
      
      userDao.displayUser();
      
    }
}
