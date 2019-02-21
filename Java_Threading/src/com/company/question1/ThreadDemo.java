package com.company.question1;

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Current Running Thread is : "+Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
      new ThreadDemo().start();
        
    }
}

