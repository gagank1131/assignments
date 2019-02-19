package com.company;

import java.util.Scanner;

public class question3 {
    
    String word = "gagan kushwaha apartment";
    int numberOfOccurrence = 0;
    
    public void charcaterOccurrence(char character) {
        
        
        numberOfOccurrence = word.split(String.valueOf(character), -1).length - 1;
        //used String.valueOf because Split only take String as a regex
        System.out.println("Number of Occurrence of Character " + character + " = " + numberOfOccurrence);
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character to counted:");
        char character = input.next().charAt(0);
        question3 object = new question3();
        
        object.charcaterOccurrence(character);
        
    }
    
}
