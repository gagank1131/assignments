package com.company.question6;

public class ExtraVeggies extends ToppingsDecorator {
    
    Pizza pizza;
    
    public ExtraVeggies(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra veggies ";
    }
    
    @Override
    int getCost() {
        return 20 + pizza.getCost();
    }
}
