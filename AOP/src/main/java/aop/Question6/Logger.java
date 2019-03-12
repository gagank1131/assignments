package aop.Question6;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    
    @AfterThrowing(pointcut = "@target(org.springframework.stereotype.Service)",throwing = "ex")
    void ThrowException(Exception ex){
    
        System.out.println("Running AfterThrowing "+ex);
    }
}
