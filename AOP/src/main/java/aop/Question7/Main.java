package aop.Question7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Configuration
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("aop.Question7");
    
        Dummy dummy = ctx.getBean(Dummy.class);
        Demo demo  = ctx.getBean(Demo.class);
        dummy.display();
        dummy.insert(23);
        dummy.update();
        
        demo.display();
    }
    
}
