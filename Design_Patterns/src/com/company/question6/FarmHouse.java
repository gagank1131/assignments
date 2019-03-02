package com.company.question6;

public class FarmHouse extends Pizza {
    
    public FarmHouse() {
        description = "FarmHouse";
    }
    
    @Override
    int getCost() {
        return 200;
    }
}
