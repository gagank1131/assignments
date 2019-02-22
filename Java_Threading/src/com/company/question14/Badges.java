package com.company.question14;

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
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Updation successfully done....");
            
        }
    }
    
    public void Deletion() {
        synchronized (this) {
            System.out.println("Deletion is in progress......");
            
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Deletion is successfully done...");
        }
    }
    
    
    public void UserOperation() {
        synchronized (this) {
            System.out.println("user entering the choice of what is to be done...");
            System.out.println("operation succesfull");
            notifyAll();
            
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
        
        new Thread(() -> {
            badges.Deletion();
        }).start();
        
        new Thread(() -> {
            badges.UserOperation();
        }).start();
        
    }
}



