package aop.Question3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config2.xml");
        Database db = ctx.getBean("database", Database.class);
        db.connect();
    }
}
