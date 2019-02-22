package com.company.question16;

import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
    ReentrantLock lock1 = new ReentrantLock(true);
    
    ReentrantLock lock2 = new ReentrantLock(true);
    
    
    public void Modification() {
        lock1.lock();
      
        System.out.println("Modification is started .................................................");
        for (int i=0;i<1000;i++){
            System.out.println("Modification is in Progress");
        }  lock2.lock();
        System.out.println("Modification is successfully completed..................................");
        lock1.unlock();
        lock2.unlock();
    }
    
    public void Updation(){
        
        lock2.lock();
        
        System.out.println("Updation just started ..........................................");
        for (int i=0;i<1000;i++){
            System.out.println("Updation is in Progress");
        }lock1.lock();
        System.out.println("Updation is completed ........................................");
        lock2.unlock();
        lock1.unlock();
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        
        Deadlock deadlock = new Deadlock();
        
        Thread thread1=new Thread(()->{
            deadlock.Updation();
        });
        
       Thread thread2= new Thread(()->{
            deadlock.Modification();
        });
        
       thread1.start();
       thread2.start();
       thread1.join();
       thread2.join();
        
        
        
    }
}
