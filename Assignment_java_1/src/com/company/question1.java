package com.company;

public class question1 {
    
    String name = "Gagan jain";
    
    
    String replace;
    
    public void UpdateName() {
        
        replace = name.replace("jain", "kushwaha"); //can also use replace all in this scenario
        System.out.println("Updated Name is :" + replace);
    }
    
    
    public static void main(String[] args) {
        
        question1 object = new question1();
        System.out.println("The original name is :" + object.name);
        object.UpdateName();
        
        
    }
    
    
}
