package BasicExample.Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        Restaurant tea1 = (Restaurant) context.getBean("res");
        tea1.getRestarantDrink();
       /* Restaurant tea2 = (Restaurant) context.getBean("res1");
        tea2.getRestarantDrink();*/
        Restaurant tea3 = (Restaurant) context.getBean("res3");
        tea3.getRestarantDrink();
    }
}
