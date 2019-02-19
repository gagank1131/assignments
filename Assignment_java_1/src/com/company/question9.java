package com.company;


enum House {
    
    BHK1("200000"), BHK2("1000000"), BHK3("1500000");
    
    private String houseName;
    
    House(String houseName) {
        this.houseName = houseName;
    }
    
    public String getPrice() {
        return houseName;
    }
    
}


public class question9 {
    
    public static void main(String[] args) {
        
        House house = House.BHK1;
        
      String pricing =  house.getPrice();
        System.out.println(pricing);
    }
}
