package com.ttn.spring_boot.springBootAssignmment;

import com.ttn.spring_boot.springBootAssignmment.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties
@SpringBootApplication
public class Application {
    
    User user() {
        User user = new User();
        user.setUserName("gagank11");
        user.setPassword("ttn");
        return user;
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}
