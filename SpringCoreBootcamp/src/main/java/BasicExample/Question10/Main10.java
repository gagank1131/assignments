package BasicExample.Question10;

import BasicExample.Question1and2.Database;
import BasicExample.Question3and4.ExpressTea;
import BasicExample.Question3and4.Restaurant;
import BasicExample.Question3and4.Tea;
import BasicExample.Question5.Complex;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Base64;

public class Main10 {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext("BasicExample.Question10");

        System.out.println("------------Question 10------------------");
        BasicExample.Question10.Restaurant teaDrink = context.getBean("rest", BasicExample.Question10.Restaurant.class);
        teaDrink.getRestarantDrink();
        Tea teaDrink1 = context.getBean("teaDrink", Tea.class);
        teaDrink1.prepareHotDrink();
        ExpressTea expressTea1 = context.getBean("expressTeaDrink", ExpressTea.class);
        expressTea1.prepareHotDrink();

    }
}
