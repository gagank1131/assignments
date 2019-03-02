package com.company.question3;

public class CarFactory {
    
    static Car buildCar(CarType carType, Location location) {
        
        Car car = null;
        
        switch (location) {
            
            case USA:
                car = UsaCarFactory.buildCar(carType);
                break;
            case INDIA:
                car = IndianCarFactory.buildCar(carType);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
    
}
