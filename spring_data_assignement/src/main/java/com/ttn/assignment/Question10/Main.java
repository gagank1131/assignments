package com.ttn.assignment.Question10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        UserDao10 userDao10 = applicationContext.getBean(UserDao10.class);

        System.out.println("for single user Object.............................");

        System.out.println(userDao10.getUser1());

        System.out.println("for List of  user Object.............................");
        System.out.println(userDao10.getUser());
    }
}
