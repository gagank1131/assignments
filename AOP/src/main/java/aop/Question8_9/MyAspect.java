package aop.Question8_9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyAspect {
    
    @Before("displayPointCut() || insertPointCut()")
    void beforeAdvice(JoinPoint joinPoint){
        System.out.println("This will run before .........");
        System.out.println("signature of the method called: "+joinPoint.getSignature());
        System.out.println("args of the method called: "+joinPoint.getArgs());
    }
    
    @Pointcut("execution(void display())")
    void displayPointCut(){
    
    }
    
    @Pointcut("execution(void insert(*))")
    void insertPointCut(){
    
    }
    
}
