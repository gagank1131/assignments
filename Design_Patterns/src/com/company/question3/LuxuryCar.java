package com.company.question3;

public class LuxuryCar extends Car {
    
    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
    }
    
    @Override
    void construct() {
        System.out.println("luxury car construction in progress.......");
    }
}
