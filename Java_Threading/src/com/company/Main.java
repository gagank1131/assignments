package com.company;

public class Main {
    
    public static void main(String[] args) {
        
        new Thread(() -> {
            System.out.println("CURRENTLY RUNNING THREAD");
        }).start();
        
    }
}
