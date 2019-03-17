package com.ttn.assignment.Question12d_e;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6d userDao6D = applicationContext.getBean(UserDao6d.class);
        
        userDao6D.insert();
    }
}
