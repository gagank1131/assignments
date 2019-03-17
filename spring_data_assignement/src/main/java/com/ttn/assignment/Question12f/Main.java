package com.ttn.assignment.Question12f;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6f userDao6F = applicationContext.getBean(UserDao6f.class);
        
        userDao6F.insert();
    }
}
