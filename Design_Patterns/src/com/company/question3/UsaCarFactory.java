package com.company.question3;

public class UsaCarFactory {
    
    static Car buildCar(CarType carType) {
        
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new MicroCar(Location.USA);
                break;
            case MINI:
                car = new MiniCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
        }
        return car;
        
    }
    
}
