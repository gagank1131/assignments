package aop.Question4_5;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    @Before("bean(services)")
    void beforeServiceMethods(){
        System.out.println("Logger aspect running before services method....");
    }
    
    @After("@target(org.springframework.stereotype.Service)")
    void afterServicesMethods(){
        System.out.println("......................................................Logger running after services method");
    }
    
}
