package com.company.question3;

public class IndianCarFactory {
    
    static Car buildCar(CarType carType) {
        
        Car car = null;
        
        switch (carType) {
            
            case MICRO:
                car = new MicroCar(Location.INDIA);
                break;
            case MINI:
                car = new MiniCar(Location.INDIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.INDIA);
                break;
            
        }
        return car;
        
    }
    
}
