package aop.Question8_9;

import org.springframework.stereotype.Service;

@Service
public class Dummy {
    
    void display(){
        System.out.println("This is Display ..");
    }
    
    void insert(Integer i){
        System.out.println("This is Insert ..");
    }
    
}
