package com.company.question16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * by tryLock() we are just checking that if the thread have both the lock then only it will proceed
 * else it will give up it's own lock in order to solve the deadlock
 */
public class DeadLockSolved {
    Lock lock1 = new ReentrantLock(true);
    
    Lock lock2 = new ReentrantLock(true);
    
    public void acquireLock(Lock lock1, Lock lock2) {
        
        boolean acquireLoack1 = lock1.tryLock();
        boolean acquireLoack2 = lock2.tryLock();
        
        if (acquireLoack1 && acquireLoack2) {
            return;
        }
        
        if (acquireLoack1) {
            lock1.unlock();
            
        }
        
        if (acquireLoack2) {
            lock2.unlock();
            
        }
        
        
    }
    
    public void Modification() {
        acquireLock(lock1, lock2);
        
        System.out.println("Modification is started .................................................");
        for (int i = 0; i < 1000; i++) {
            System.out.println("Modification is in Progress");
        }
        System.out.println("Modification is successfully completed..................................");
        lock1.unlock();
        lock2.unlock();
    }
    
    public void Updation() {
        
        acquireLock(lock2, lock1);
        
        System.out.println("Updation just started ..........................................");
        for (int i = 0; i < 1000; i++) {
            System.out.println("Updation is in Progress");
        }
        System.out.println("Updation is completed ........................................");
        lock2.unlock();
        lock1.unlock();
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        
        DeadLockSolved deadlock = new DeadLockSolved();
        
        Thread thread1 = new Thread(() -> {
            deadlock.Updation();
        });
        
        Thread thread2 = new Thread(() -> {
            deadlock.Modification();
        });
        
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        
    }
}
