package com.company.question12;
import java.util.concurrent.atomic.AtomicInteger;


public class Badges {
    
    AtomicInteger goldStar = new AtomicInteger();
    
    public void UpdateGoldStar() {
        
        goldStar.incrementAndGet();
        
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        Badges badges = new Badges();
        
        Thread thread = new Thread(() -> {
            
            for (int i = 0; i < 1000; i++) {
                badges.UpdateGoldStar();
            }
        });
        
        Thread thread2 = new Thread(() -> {
            
            for (int i = 0; i < 1000; i++) {
                badges.UpdateGoldStar();
            }
        });
        
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println("this is the last statement - " + badges.goldStar);
    }
}
