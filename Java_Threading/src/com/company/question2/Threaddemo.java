package com.company.question2;

public class Threaddemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);     //This will make the Thread 1 sleep for 3 seconds and thread 2 will execute meanhwile
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 is running !!");
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running !!");
            }
        });
        
        thread1.start();
        thread1.join();                   //Thread 2 will wait for thread 1 to finish the execution despite of the sleep()
        thread2.start();
    
        
        
        
        
        
    }
}
