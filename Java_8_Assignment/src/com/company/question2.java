package com.company;


@FunctionalInterface
interface Calculation {
    Integer compute(Integer integer1, Integer integer2);
}

public class question2 {
    public static void main(String[] args) {
        
        
        Calculation calculation = (e1, e2) -> (e1 + e2) / 2;
        
        Integer result = calculation.compute(45, 67);
        System.out.println(result);
    }
}
