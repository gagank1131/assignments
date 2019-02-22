package com.company.question8;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledAtInterval {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("This is Thread 1 running.....");
            }
        }, 0,1, TimeUnit.SECONDS );
    
    
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is Thread 2 running....");
            }
        }, 0,1, TimeUnit.SECONDS );
    
    
//        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("This is Thread 3 running....");
//            }
//        }, 3,4, TimeUnit.SECONDS );
//
//
//        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("This is Thread 4 running....");
//            }
//        }, 3,5, TimeUnit.SECONDS );
    }
}
