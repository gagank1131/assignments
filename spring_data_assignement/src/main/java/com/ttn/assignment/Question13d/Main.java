package com.ttn.assignment.Question13d;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6_13_d userDao13a = applicationContext.getBean(UserDao6_13_d.class);
        
        userDao13a.insert();
    }
}
