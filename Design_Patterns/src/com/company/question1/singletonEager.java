package com.company.question1;

/**
 * In this instance is created always irrespective of  whether it is required or not .
 */
public class singletonEager {
    
    private static volatile singletonEager instance = new singletonEager();
    
    
    private singletonEager() {
        System.out.println("Instance is created........");
    }
    
    public static singletonEager getInstance() {
        return instance;
    }
    
    
}
