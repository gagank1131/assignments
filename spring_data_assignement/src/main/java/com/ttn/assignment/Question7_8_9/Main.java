package com.ttn.assignment.Question7_8_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UserDaoInsert userDaoInsert = applicationContext.getBean(UserDaoInsert.class);
    
        User user = new User();
        user.setUsername("abcd");
        user.setPassword("12");
        user.setName("abcd");
        user.setAge(20);
        user.setDob(new Date());
        
//        userDaoInsert.insertUser(user);
        userDaoInsert.displayMap();
        userDaoInsert.displayList();
        
    }
}
