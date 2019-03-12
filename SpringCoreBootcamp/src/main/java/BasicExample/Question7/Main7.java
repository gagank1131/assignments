package BasicExample.Question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("-------------Quetion 7---------------");
        Restaurant tea4 = (Restaurant) context.getBean("tearestaurant1");
        Restaurant tea5 = (Restaurant) context.getBean("tearestaurant1");
        System.out.println("HashCode Of First Bean " + tea4.hashCode());
        System.out.println("HashCode Of Second Bean " + tea5.hashCode());

    }
}
