package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class question11 {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13);
    
        System.out.println(list.stream().mapToDouble(i -> i*2 ).average());
    }
}
