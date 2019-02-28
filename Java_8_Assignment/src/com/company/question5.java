package com.company;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


class employee1 {
    
    private String name;
    private Integer age;
    private String city;
    
    public employee1(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
public class question5 {
    
    
    public static void main(String[] args) {
        /**
         * consumer code ---------------------------------------------------
         */
        Consumer<Integer> Consumer = i -> System.out.println(i*2);
        Consumer.accept(6);
    
        /**
         * supplier code--------------------------------------------------------
         *
         */
        
        Supplier<String> supplier = () -> "gagan";
        System.out.println(supplier.get());
        
        Supplier<employee1> employee1Supplier = () -> new employee1("gagan",25,"delhi");
        employee1 emp1 = employee1Supplier.get();
        System.out.println(emp1);
    
        /**
         * predicate code---------------------------------------------------------
         */
        Predicate<Integer> predicate = i -> i>50;
        System.out.println(predicate.test(59));
    
        /**
         * Function --------------------------------------------------------------
         */
        Function<Integer,Integer> function = i -> i*i*i;
        System.out.println(function.apply(4));
       
    
    }
    
}
