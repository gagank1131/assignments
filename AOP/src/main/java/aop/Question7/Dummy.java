package aop.Question7;

import org.springframework.stereotype.Service;

@Service
public class Dummy {
    
    void display(){
    
        System.out.println("this is display");
    }
    
    void insert(Integer i){
        System.out.println("insert with "+i);
    }
    void update(){
        System.out.println("this is update");
    }
    
    
}
