package aop.Question4_5;

import org.springframework.stereotype.Service;

@Service("services")
public class Dummy {
    void display(){
        System.out.println("Display");
    }
    
    void insert(){
        System.out.println("values inserted");
    }
    
    void update(){
        System.out.println("values updated");
    }
}
