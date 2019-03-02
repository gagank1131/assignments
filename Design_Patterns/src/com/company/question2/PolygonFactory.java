package com.company.question2;

public class PolygonFactory {
    
    static PolygonShape getResturantObject(String name) {
        
        PolygonShape polygonShape = new PolygonShape();
        
        switch (name) {
            case "Circle":
                polygonShape.setPolygon(new Circle());
                break;
            case "Rectangle":
                polygonShape.setPolygon(new Rectangle());
                break;
            case "Square":
                polygonShape.setPolygon(new Square());
        }
        return polygonShape;
        
    }
    
}
