package com.company.question1;

/**
 *
 * This is used to particularly prevent multiple thread from getting the different instance
 *
 */
public class singletonLazyDoubleLock {
    
    private static volatile singletonLazyDoubleLock instance = null;
    
    public singletonLazyDoubleLock() {
    }
    
    public static singletonLazyDoubleLock getInstance() {
        if (instance == null) {
            synchronized (singletonLazyDoubleLock.class) {
                if (instance == null) {
                    
                    instance = new singletonLazyDoubleLock();
                    
                }
                
            }
        }
        
        return instance;
        
    }
}
