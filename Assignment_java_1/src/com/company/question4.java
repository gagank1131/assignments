package com.company;

import java.util.Scanner;

import static java.lang.Character.*;

public class question4 {
    
    int totalChar = 0;
    int upperChar = 0;
    int lowerChar = 0;
    int digitchar = 0;
    int specialChar = 0;
    int spaceChar = 0;
    
    public void Calculate(String string) {
        
        for (int i = 0; i < string.length(); i++) {
            totalChar++;
            if (isUpperCase(string.charAt(i)) && isLetter(string.charAt(i))) {
                upperChar++;
                
            } else if (isLowerCase(string.charAt(i)) && isLetter(string.charAt(i))) {
                
                lowerChar++;
            } else if (isDigit(string.charAt(i))) {
                
                digitchar++;
            } else if (isSpace(string.charAt(i))) {
                
                spaceChar++;
            } else {
                specialChar++;
            }
            
            
        }
        System.out.println("Number of UpperCase Characters : " + upperChar + " Percentage= " + upperChar * 100 / totalChar);
        System.out.println("Number of LowerCase Characters : " + lowerChar + " Percentage= " + lowerChar * 100 / totalChar);
        System.out.println("Number of Digits : " + digitchar + " Percentage= " + digitchar * 100 / totalChar);
        System.out.println("Number of Space Characters : " + spaceChar + " Percentage= " + spaceChar * 100 / totalChar);
        System.out.println("Number of Special Characters : " + specialChar + " Percentage= " + specialChar * 100 / totalChar);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String string = sc.nextLine();
        question4 object = new question4();
        object.Calculate(string);
        
        
    }
}
