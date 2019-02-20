package com.company.Bank_Question;

public class Bank {
    
    private int rateOfInterest;
    private int number_of_branches;
    private int number_of_customers;
    
    public Bank(int rateOfInterest, int number_of_branches, int number_of_customers) {
        this.rateOfInterest = rateOfInterest;
        this.number_of_branches = number_of_branches;
        this.number_of_customers = number_of_customers;
    }
    
    
    public void getDetails() {
        
        System.out.println("Rate of Interest : " + rateOfInterest);
        System.out.println("Number of Brances : " + number_of_branches);
        System.out.println("Number of Customers : " + number_of_customers);
        
    }
}
