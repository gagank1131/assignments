package com.company.question3;

abstract class Car {
    
    CarType carType;
    
    Location location;
    
    
    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }
    
    
    abstract void construct();
    
    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}
