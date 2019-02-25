package com.company;

import java.util.*;

public class question6 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String userString=sc.nextLine();
        Map<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        char[] arr = userString.toCharArray();
        
        for(Character c:
                    arr){
            if(linkedHashMap.containsKey(c)){
                linkedHashMap.put(c,linkedHashMap.get(c)+1);
            }else
                linkedHashMap.put(c,1);
        }
        
        
        List<ValueFrequencyPair> list = new LinkedList<>();
        
        for(Map.Entry<Character,Integer> e:linkedHashMap.entrySet()){
            list.add(new ValueFrequencyPair(e.getKey(),e.getValue()));
            
        }
        Collections.sort(list, new SortFrequency());
        for(ValueFrequencyPair v: list){
            System.out.println(v.ch+"  "+v.value);
        }
        
        
    }
 
}
class ValueFrequencyPair{
    
    Character ch;
    Integer value;
    
    public ValueFrequencyPair(Character ch, Integer value) {
        this.ch = ch;
        this.value = value;
    }
}

class SortFrequency implements Comparator<ValueFrequencyPair>{
    
    
    @Override
    public int compare(ValueFrequencyPair v1, ValueFrequencyPair v2) {
        if(v1.value == v2.value){
        return 0;
        }else if(v1.value >v2.value)
        return -1;
        else
            return 1;
    }
}
