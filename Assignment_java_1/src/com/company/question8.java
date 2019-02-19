package com.company;


public class question8 {
    
    
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("Universal!");
        System.out.println("The Original String is : " + string);
        
        string.reverse();
        System.out.println("The Reversed String is :" + string);
        
        string.replace(4, 9, "");
        System.out.println(string);
    }
}
