package com.ttn.assignment.Question13a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6_13_a userDao13a = applicationContext.getBean(UserDao6_13_a.class);
        
        userDao13a.insert();
    }
}
