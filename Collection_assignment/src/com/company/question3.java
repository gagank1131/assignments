package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class question3 {
    
    
    public void CountOccurrence(String userString) {
        
        char[] charArr = userString.toCharArray();
        
        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
        
        for (Character c :
                charArr) {
            
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else
                countMap.put(c, 1);
        }
        for (Map.Entry entry :
                countMap.entrySet()) {
            System.out.println(entry.getKey() + " is Occurring :" + entry.getValue()+" Times");
        }
        
    }
    
    public static void main(String[] args) {
        
        question3 object = new question3();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        
        String userString = sc.nextLine();
        
        
        object.CountOccurrence(userString.toLowerCase());
        
    }
}
