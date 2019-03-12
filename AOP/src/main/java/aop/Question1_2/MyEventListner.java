package aop.Question1_2;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventListner implements ApplicationListener {
    
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.getClass().getName());
    }
}
