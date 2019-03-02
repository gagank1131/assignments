package com.company.question6;

public class DecoratorPattern {
    public static void main(String[] args) {
        
        Pizza pizza1 = new Margherita();
        System.out.println(pizza1.getDescription()+" cost: "+pizza1.getCost());
        
        Pizza pizza2 = new FarmHouse();
        
        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription()+" cost: "+pizza2.getCost());
        
    }
}
