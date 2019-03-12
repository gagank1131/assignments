package aop.Question3;

import org.springframework.context.ApplicationListener;

public class MyCustomListner implements ApplicationListener<CustomEvent> {
    
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.getClass().getName());
    }
}
