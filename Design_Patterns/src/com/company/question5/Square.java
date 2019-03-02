package com.company.question5;

public class Square extends Shape{
    
    
    public Square(Color color) {
        super(color);
    }
    
    @Override
    public void applycolor() {
        color.applyColor();
        System.out.println("Square");
    }
}
