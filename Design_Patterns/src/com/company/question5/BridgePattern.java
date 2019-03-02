package com.company.question5;

public class BridgePattern {
    public static void main(String[] args) {
        
        Shape shape1 = new Triangle(new PinkColor());
        
        shape1.applycolor();
        
        Shape shape2 = new Square(new BlueColor());
        
        shape2.applycolor();
        
        
    }
}
