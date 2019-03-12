package BasicExample.Question3and4;

import BasicExample.Question1and2.Database;
import BasicExample.Question5.Complex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        // BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring-config.xml");


        //Question 3 and 4

        System.out.println("----Question 3 and 4-----");

        Tea tea = context.getBean("tea", Tea.class);
        ExpressTea expressTea = context.getBean("expresstea", ExpressTea.class);

        Restaurant restaurant = context.getBean("tearestaurant", Restaurant.class);
        restaurant.getRestarantDrink();
        Restaurant restaurant1 = context.getBean("expressTeaRestaurant", Restaurant.class);

        restaurant1.getRestarantDrink();

        System.out.println(" ");

    }
}
