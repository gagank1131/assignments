package aop.Question6;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Dummy {
    void update()  {
    
    
        try {
            throw new IOException("IOException");
        } catch (IOException e) {
            System.out.println(e);;
        }
    
    
    }
    void display(){
        System.out.println("This is the Display method..........");
    
    }
    
    void insert()  {
    
        try {
            throw new IOException("IOException");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
