package com.company.question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Process implements Runnable {
    int id;
    
    public Process(int id) {
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Thread :"+Thread.currentThread().getName()+" START : "+id);
        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread :"+Thread.currentThread().getName()+" END : "+id);
    }
}

public class ThreadPoolDemo {
    public static void main(String[] args) {
        
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        for(int  i=0;i<40;i++) {
            
            executorService.submit(new Process(i));
        }
        
        executorService.shutdown();
    }
}
