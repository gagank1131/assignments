package com.company.question8;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDemo {
    
    public static void main(String[] args) {
    
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("This task 1 will run after a delay of 7 second");
            }
        }, 7000, TimeUnit.MILLISECONDS);
        
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("This task 2 will run after 4 seconds");
            }
        },4000, TimeUnit.MILLISECONDS);
        
        scheduledExecutorService.shutdown();
    }
}
