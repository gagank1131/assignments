package com.company.question6;

abstract class Pizza {
    
    String description = "pizza base";
    
    public String getDescription() {
        return description;
    }
    
    abstract int getCost();
}
