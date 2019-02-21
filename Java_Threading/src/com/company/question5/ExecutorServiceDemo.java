package com.company.question5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            
            executorService.submit(() -> {
                System.out.println("This is Thread 1");
            });
    
            executorService.submit(() -> {
                System.out.println("This is Thread 2");
            });
    
            executorService.submit(() -> {
                System.out.println("This is Thread 3");
            });
    
            executorService.submit(() -> {
                System.out.println("This is Thread 4");
            });
    
    
        } finally {
            executorService.shutdown();
        }
    
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());  //sometimes gives true and sometimes false, as it checks that all active tasks are completed
    }
}
