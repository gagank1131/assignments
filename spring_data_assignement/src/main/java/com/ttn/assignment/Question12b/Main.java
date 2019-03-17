package com.ttn.assignment.Question12b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        UserDao6b userDao6b = applicationContext.getBean(UserDao6b.class);
        
        userDao6b.insert();
    }
}
