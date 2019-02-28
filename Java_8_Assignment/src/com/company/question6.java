package com.company;


interface Compute{
    
    default Integer get(Integer integer){
        return integer+50;
    }
    
}
public class question6 implements Compute{
    
    public static void main(String[] args) {
        
       question6 object = new question6();
       object.get(4);
        
    }
}
