package aop.Question7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    @Before("execution(void display())")
    void beforeDisplay(){
        System.out.println("Logger running before display..................................");
    }
    
    @After("execution(void display())")
    void afterDisplay(){
        System.out.println("...........................................Logger running after display");
    }
    
    
    @Before("args(Integer)")
    void beforeInsert(){
        System.out.println("Logger running before Insert..................................");
    }
    
    @After("args(Integer)")
    void afterInsert(){
        System.out.println("...........................................Logger running after Insert");
    }
    
    @Before("this(aop.Question7.Dummy)")
    void beforeAdvice() {
        System.out.println("Running before advice by this ....................................");
    }
    
    @After("this(aop.Question7.Dummy)")
    void afterAdvice() {
        System.out.println(".................................................Running after advice by this ");
    }
    
    @Before("bean(demo)")
    void beforeDemo() {
        System.out.println("Running before Demo bean methods ....................................");
    }
    
    @After("bean(demo)")
    void afterDemo() {
        System.out.println(".................................................Running after Demo bean methods by ");
    }
    
    
    @Before("within(aop.Question7.*)")
    void beforeDemoWithin() {
        System.out.println("Running before demo by within");
    }
    
}
