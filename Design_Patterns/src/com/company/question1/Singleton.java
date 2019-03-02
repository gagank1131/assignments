package com.company.question1;

import static java.lang.Runtime.getRuntime;

public class Singleton {
    
    
    public static void main(String[] args) {
        singletonEager.getInstance();
        System.out.println(singletonEager.getInstance());
        System.out.println(singletonEager.getInstance());
       
        
        singletonLazy.getInstance();
        singletonLazy.getInstance();
    
        System.out.println(singletonLazyDoubleLock.getInstance());
        System.out.println(singletonLazyDoubleLock.getInstance());
    
        System.out.println(SingletonEnum.INSTANCE);
    
        System.out.println(getRuntime()); //example of singleton in java
        
    }
}
