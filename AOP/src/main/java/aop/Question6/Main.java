package aop.Question6;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;

@EnableAspectJAutoProxy
@Configuration
public class Main {
    public static void main(String[] args)  {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("aop.Question6");
        
        Dummy dummy = ctx.getBean(Dummy.class);
        
        dummy.update();
        dummy.display();
        dummy.insert();
    }
}
