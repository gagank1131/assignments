package BasicExample.Question8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main8 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println("------------Question 8------------------");
        Restaurant tea6 = (Restaurant) context.getBean("tearestaurant3");
        tea6.getRestarantDrink();
        Restaurant tea7 = (Restaurant) context.getBean("tearestaurant3");
        tea7.getRestarantDrink();
        Restaurant tea8 = (Restaurant) context.getBean("tearestaurant3");
        tea8.getRestarantDrink();

    }
}
