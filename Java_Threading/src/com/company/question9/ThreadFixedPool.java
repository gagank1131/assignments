package com.company.question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFixedPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        
        for (int j = 0; j < 50; j++)
            executorService.submit(new Process(j));
        executorService.shutdown();
    }
    
}
