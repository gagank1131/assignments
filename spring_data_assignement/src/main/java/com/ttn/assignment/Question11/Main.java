package com.ttn.assignment.Question11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
      UserDaoHibernate  userDaoHibernate =   applicationContext.getBean(UserDaoHibernate.class);
      
      userDaoHibernate.sessionFactoryDemo();
    }
}
