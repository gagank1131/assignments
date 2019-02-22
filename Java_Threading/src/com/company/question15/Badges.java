package com.company.question15;

/**
 * Reentrack lock act same as Synchronized block but also it using some extra property of providing lock to the longest
 * waiting thread so in this case out updation successfully done thread will execute last
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Badges {
    
    int goldbadges;
    
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    
    public void modification() {
        lock.lock();
        System.out.println("Modification is in progress......");
        try {
            condition.await();
            goldbadges++;
            
            System.out.println("Modification is successfully completed.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        
        
    }
    
    public void Updation() {
        
        try {
            lock.lock();
            
            System.out.println("Updation is in progress......");
            condition.await();
            System.out.println("Updation is Successfully completed......");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            
            
            lock.unlock();
        }
    }
    
    public void Deletion() {
        
        try {
            lock.lock();
            System.out.println("Deletion is in Progress.......");
            System.out.println("Deletion is Completed.....");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
    
    
    public static void main(String[] args) {
        Badges badges = new Badges();
        
        new Thread(() -> {
            
            badges.modification();
            
        }).start();
        
        new Thread(() -> {
            
            badges.Updation();
            
        }).start();
        
        new Thread(() -> {
            
            badges.Deletion();
            
        }).start();
        
        
        System.out.println(badges.goldbadges);
    }
}
