package com.company;

import java.util.Arrays;

public class question6 {
    
    
    public void FindUniqueElement(int[] array, int length) {
        
        Arrays.sort(array);
        
        //sorted the array so it easy to compare adjacent elements and first and last
        
        if (array[0] != array[1]) {
            System.out.println("Unique Element is : " + array[0]);
        }
        
        for (int i = 1; i < length - 1; i++) {
            
            if (array[i] != array[i + 1] && array[i] != array[i - 1]) {
                System.out.println("Unique Element is : " + array[i]);
            }
            
        }
        
        if (array[length - 2] != array[length - 1]) {
            System.out.println("Unique Element is : " + array[length - 1]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        question6 object = new question6();
        int arr[] = {4, 6, 4, 7, 6, 8, 7, 8, 5};
        int length = arr.length;
        object.FindUniqueElement(arr, length);
        
    }
}
