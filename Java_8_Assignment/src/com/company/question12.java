package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class question12 {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(56, 3, 42, 8, 8, 5, 4, 34, 6, 43, 65, 8, 24, 23, 55, 6, 56, 54, 33, 765, 56, 45, 45, 457, 4);
        
        Optional<Integer> num = list.stream().filter(i -> i > 3).filter(i -> i % 2 != 0).findFirst();
        System.out.println(num);
    }
}
