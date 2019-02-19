package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question5 {
    
    
    public void FindCommonElements(int array1[], int array2[]) {
        
        List<Integer> numberList = new ArrayList<Integer>();
        
        for (int i = 0; i < array1.length; i++) {
            
            for (int j = 0; j < array2.length; j++) {
                
                if (array1[i] == array2[j]) {
                    if (!numberList.contains(array1[i])) {
                        numberList.add(array1[i]);
                    }
                }
            }
        }
        System.out.println("Common elements in arrays are : " + numberList);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements of both array = "); //supposing both arrays are of same size
        int numberOfElements = sc.nextInt();
        
        
        System.out.println("Enter Elements of first array = ");
        int arr[] = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Enter Elements of second array = ");
        int arr2[] = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            arr2[i] = sc.nextInt();
        }
        
        
        question5 object = new question5();
        object.FindCommonElements(arr, arr2);
        
    }
}
