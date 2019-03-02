package com.company.question3;

public class AbstractFactoryPattern {
    
    public static void main(String[] args) {
    
        System.out.println(CarFactory.buildCar(CarType.MINI,Location.USA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.INDIA));
        
    }
    
    

}

