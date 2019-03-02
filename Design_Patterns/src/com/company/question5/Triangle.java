package com.company.question5;

public class Triangle extends Shape {
    
    
    public Triangle(Color color) {
        super(color);
    }
    
    @Override
    public void applycolor() {
        color.applyColor();
        System.out.println("Triangle");
        
    }
}
