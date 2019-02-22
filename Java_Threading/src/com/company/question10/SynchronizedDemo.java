package com.company.question10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedDemo {
    
    int count;
    
    public void Modify() {
        
        count++;
        
    }
    
    public static void main(String[] args) throws InterruptedException {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=1000; i++) {
                    synchronizedDemo.Modify();
                }
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=1000; i++) {
                    synchronizedDemo.Modify();
                }
            }
        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
      
        
        
        System.out.println(synchronizedDemo.count);
        
    }
    
    
}
