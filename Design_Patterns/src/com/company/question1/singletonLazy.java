package com.company.question1;

public class singletonLazy {
    
    private static volatile singletonLazy instance = null;
    
    private singletonLazy() {
        System.out.println("instance created by lazy singleton.....");
    }
    
    public static singletonLazy getInstance() {
        
        if (instance == null) {
            synchronized (singletonLazy.class) {
                
                instance = new singletonLazy();
                
            }
        }
        return instance;
    }
}
