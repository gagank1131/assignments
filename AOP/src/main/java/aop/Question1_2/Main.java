package aop.Question1_2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ctx.start();
        Dummy dummy = ctx.getBean("dummy",Dummy.class);
        dummy.display();
        ctx.stop();
        ctx.close();
    }
}
