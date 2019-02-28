package com.company;

@FunctionalInterface
interface Compute1 {
    
    boolean isGreater(Integer num1, Integer num2);
    
}

@FunctionalInterface
interface Compute2 {
    
    int increment(int num1);
    
}


@FunctionalInterface
interface Compute3 {
    
    String concat(String string1, String string2);
    
}

@FunctionalInterface
interface Compute4 {
    
    String toUpper(String string);
    
}

public class question1 {
    
    public static void main(String[] args) {
        
        Compute1 compute1 = (num1, num2) -> num1 > num2;
        boolean result1 = compute1.isGreater(5, 4);
        System.out.println("Output of first question is :" + result1);
        
        Compute2 compute2 = e -> e++;
        int result2 = compute2.increment(5);
        System.out.println("Output of second question is : " + result2);
        
        
        Compute3 compute3 = (e, f) -> {
            return e.concat(f);
        };
        String result3 = compute3.concat("gagan", "kushwaha");
        System.out.println("Output of third question is :" + result3);
        
        
        Compute4 compute4 = s -> s.toUpperCase();
        String result4 = compute4.toUpper("gagankushwha");
        System.out.println("Output of fourth question is :" + result4);
    }
    
    
}
