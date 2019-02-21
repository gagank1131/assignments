package com.company.question1;

public class RunnableDemo implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Currently running thread is :" + Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        
        new Thread(new RunnableDemo()).start();
        
    }
    
    
}
