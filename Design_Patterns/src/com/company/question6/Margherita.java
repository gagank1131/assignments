package com.company.question6;

public class Margherita extends Pizza {
    
    public Margherita() {
        description = "Margherita";
    }
    
    @Override
    int getCost() {
        return 150;
    }
}
