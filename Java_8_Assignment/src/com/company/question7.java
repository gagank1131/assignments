package com.company;

interface CustomInteface {
    
    default String get() {
        
        return "This is the default implementation ........";
    }
}

public class question7 implements CustomInteface {
    
    @Override
    public String get() {
        return "This is the override of default";
    }
    
    public static void main(String[] args) {
        
        question7 obj = new question7();
        System.out.println(obj.get());
        
        
    }
}
