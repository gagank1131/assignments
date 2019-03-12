package aop.Question4_5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@Configuration
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext("aop.Question4_5");
        
       Dummy dummy =  configurableApplicationContext.getBean("services",Dummy.class);
        
        dummy.display();
        dummy.insert();
        dummy.update();
    }
}
