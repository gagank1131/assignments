package com.ttn.assignment.Question12;

import com.ttn.assignment.Question10.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDao6 userDao6 = applicationContext.getBean(UserDao6.class);
        userDao6.insert();
    }
}
