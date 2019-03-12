package BasicExample.Question1and2;

import BasicExample.Question1and2.Database;
import BasicExample.Question3and4.ExpressTea;
import BasicExample.Question3and4.Restaurant;
import BasicExample.Question3and4.Tea;
import BasicExample.Question5.Complex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
       // BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring-config.xml");


        //Question 1 and 2

        System.out.println("----Question 1 and 2-----");
        Database database=context.getBean("database",Database.class);
        System.out.println(database.getName());
        System.out.println(database.getPort());





    }
}
