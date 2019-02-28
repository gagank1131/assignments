package com.company;

@FunctionalInterface
interface CalculationsStatic {
    
    Integer multiply(Integer integer1, Integer integer2);
    
    
}

@FunctionalInterface
interface CalculationInstance {
    
    Integer add(Integer integer1, Integer integer2);
}


@FunctionalInterface
interface CalculationInstanceSubtract {
    
    Integer subtract(Integer integer1, Integer integer2);
}


public class question3 {
    
    static Integer multiply(Integer integer1, Integer integer2) {
        return integer1 * integer2;
    }
    
    Integer add(Integer integer1, Integer integer2) {
        return integer1 + integer2;
    }
    
    Integer subtract(Integer integer1, Integer integer2) {
        return integer1 - integer2;
    }
    
    public static void main(String[] args) {
        
        CalculationsStatic calculations = question3::multiply;
        System.out.println(calculations.multiply(3, 56));
        
        CalculationInstance calculationInstance = new question3()::add;
        Integer resultAdd = calculationInstance.add(5, 9);
        System.out.println(resultAdd);
        
        CalculationInstanceSubtract calculationInstanceSubtract = new question3()::subtract;
        Integer resultSubtract = calculationInstanceSubtract.subtract(10, 8);
        System.out.println(resultSubtract);
        
        
    }
    
    
}
