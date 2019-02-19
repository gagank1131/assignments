package com.company;

public class question7 {                 //Accessed directly in static methods
    
    static String firstName;
    static String lastName;
    static int age;
    
    
    static {                            //Static block is used for initializing the static variables
                                        //This block gets executed as class loaded in the memory
        firstName="Gagan";              //executes in sequence in case of multiple static blocks
        lastName="Kushwaha";
        age=25;
        
    }
    
    static void PrintDetails(){
        
        System.out.println("First Name : "+firstName);
        System.out.println("First Name : "+lastName);
        System.out.println("First Name : "+age);
        
    }
    
    
    
    public static void main(String[] args) {
    
        PrintDetails();     // can call static method directly
    
 
        
    }
    
    
    
}
