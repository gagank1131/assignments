package com.company.question5;

abstract class Shape {
    
    public Color color;
    
    public Shape(Color color) {
        this.color = color;
    }
    
    abstract public void applycolor();
}
