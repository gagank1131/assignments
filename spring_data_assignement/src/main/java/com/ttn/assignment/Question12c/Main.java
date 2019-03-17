package com.ttn.assignment.Question12c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6c userDao6c = applicationContext.getBean(UserDao6c.class);
        
        userDao6c.insert();
    }
}
