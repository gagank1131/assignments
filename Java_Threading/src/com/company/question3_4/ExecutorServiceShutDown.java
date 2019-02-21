package com.company.question3_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceShutDown {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is my new thread 1 ");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("This is my new thread 2");
                    
                }
            });
            
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    
                    System.out.println("This is my new thread 3");
                }
            });
        } finally {
            executorService.shutdown();           //executes the thread that have been submited and fulfill them but doesn't ytake any new submits
        }
        System.out.println(executorService.isShutdown());
    }
}
