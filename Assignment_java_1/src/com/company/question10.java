package com.company;

public class question10 {
    
    public int add(int number1, int number2) {
        return number1 + number2;
    }
    
    public double add(double number1, double number2) {
        return number1 + number2;
    }
    
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }
    
    public double multiply(float number1, float number2) {
        return number1 * number2;
    }
    
    public String concat(String string1, String string2) {
        return string1.concat(string2);
    }
    
    public String concat(String string1, String string2, String string3) {
        return string1.concat(string2.concat(string3));
    }
    
    public static void main(String[] args) {
        question10 object = new question10();
        System.out.println(object.add(5,8));
        System.out.println(object.add(23.3,567.54));
        System.out.println(object.multiply(6,8));
        System.out.println(object.multiply(23.3f,67.8f));
        System.out.println(object.concat("gagan","kushwaha"));
        System.out.println(object.concat("gagan","kushwaha","Noida"));
        
        
    }
}