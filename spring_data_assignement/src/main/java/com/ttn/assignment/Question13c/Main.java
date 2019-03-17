package com.ttn.assignment.Question13c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6_13_c userDao13a = applicationContext.getBean(UserDao6_13_c.class);
        
        userDao13a.insert();
    }
}
