package com.company.question13;

/**
 * In this wait forces the current to wait untill some matching syncronised block notify it
 */

public class Badges {
    
    public void Modification() {
        synchronized (this) {
            System.out.println("Modification started ....");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Modification successfully finished .....");
        }
    }
    
    public void Updation() {
        synchronized (this) {
            System.out.println("Updation is in progress....");
            
            System.out.println("Updation successfully done....");
            notify();
        }
    }
    
    public static void main(String[] args) {
        
        Badges badges = new Badges();
        
        new Thread(() -> {
            badges.Modification();
        }).start();
        
        new Thread(() -> {
            badges.Updation();
        }).start();
        
        
    }
}
