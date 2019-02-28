package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class question10 {
    public static void main(String[] args) {
        
        
        List<Integer> list = Arrays.asList(56, 3, 42, 8, 8, 5, 4, 34, 6, 43, 65, 8, 24, 23, 55, 6, 56, 54, 33, 765, 56, 45, 45, 457, 4);
        
        Optional<Integer> sum = list.stream().filter(i -> i > 5).reduce((i, i2) -> i + i2);
        System.out.println(sum);
    }
}
