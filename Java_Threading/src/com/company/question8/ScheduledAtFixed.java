package com.company.question8;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledAtFixed {
    
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("This thread  1 is Running.... ");
            }
        },0 ,1 , TimeUnit.SECONDS );
        
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
              
                System.out.println("This thread 2 is Running.... ");
            }
        },0 ,1 , TimeUnit.SECONDS );
        
        
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("This thread 3 is Running.... ");
            }
        },0 ,1 , TimeUnit.SECONDS );
        
        
        
    }
}
