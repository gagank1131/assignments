package com.company.question3;

public class DefaultCarFactory {
    
    
    static Car buildCar(CarType carType) {
        
        Car car = null;
        
        switch (carType) {
            
            case MICRO:
                car = new MicroCar(Location.DEFAULT);
                break;
            case LUXURY:
                car = new MiniCar(Location.DEFAULT);
                break;
            case MINI:
                car = new LuxuryCar(Location.DEFAULT);
                break;
        }
        return car;
        
        
    }
    
    
}
