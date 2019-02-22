package com.company.question10;

public class SynchronizeMethodDemo {
    
    int counter;
    
  synchronized public void ModifySync() {
        counter++;
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        
       SynchronizeMethodDemo synchronizeMethodDemo= new SynchronizeMethodDemo();
        
      Thread thread1 = new Thread(() -> {
            for(int i=0;i<=1000;i++) {
                synchronizeMethodDemo.ModifySync();
            }
        });
        
        Thread thread2=new Thread(() -> {
            for(int i=0;i<=1000;i++) {
                synchronizeMethodDemo.ModifySync();
            }
        });
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
        System.out.println(synchronizeMethodDemo.counter);
    }
    
    
}
