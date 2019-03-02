package com.company.question3;

public class MicroCar extends Car {
    
    
    public MicroCar(Location location) {
        super(CarType.MICRO, location);
    }
    
    @Override
    void construct() {
        System.out.println("mini car construction in progress......");
    }
}
