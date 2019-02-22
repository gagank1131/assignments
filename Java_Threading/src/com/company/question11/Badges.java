package com.company.question11;

/**
 * Trying to model the concept of Multithreading and Synchronized block by updating number of gold stars by
 * two different threads
 */
public class Badges {
    
    int goldStar;
    
    public void UpdateGoldStar() {
        synchronized (this) {
            goldStar++;
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Badges badges = new Badges();
        
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                badges.UpdateGoldStar();
        });
        
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                badges.UpdateGoldStar();
        });
        
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        
        System.out.println(badges.goldStar);
    }
}
