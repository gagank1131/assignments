package com.company.question2;

public class FactoryPattern {
    
    public static void main(String[] args) {
        
        PolygonShape polygonShapeWithCircle = PolygonFactory.getResturantObject("Circle");
        polygonShapeWithCircle.getPolygon().prepareShape();
        
        PolygonShape polygonShapeWithRectangle = PolygonFactory.getResturantObject("Rectangle");
        polygonShapeWithRectangle.getPolygon().prepareShape();
        
        PolygonShape polygonShapeWithSquare = PolygonFactory.getResturantObject("Square");
        polygonShapeWithSquare.getPolygon().prepareShape();
        
    }
}
