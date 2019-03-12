package BasicExample.Question5;

import BasicExample.Question1and2.Database;
import BasicExample.Question3and4.ExpressTea;
import BasicExample.Question3and4.Restaurant;
import BasicExample.Question3and4.Tea;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
       // BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring-config.xml");




        //Question 5

        System.out.println("----Question 5-----");

        Complex complex=context.getBean("complexBean",Complex.class);
        System.out.println(complex.getList1());
        System.out.println(complex.getSet1());
        System.out.println(complex.getMap1());




    }
}
