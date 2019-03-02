package com.company.question3;

public class MiniCar extends Car {
    
    
    public MiniCar(Location location) {
        super(CarType.MINI, location);
    }
    
    @Override
    void construct() {
        System.out.println("mini car construction is in progress.........");
    }
}
