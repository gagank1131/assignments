package com.company.question6;

public class Cheese extends ToppingsDecorator {
    
    Pizza pizza;
    
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription()+", Extra Cheese ";
    }
    
    @Override
    int getCost() {
        return 50+pizza.getCost();
    }
}
