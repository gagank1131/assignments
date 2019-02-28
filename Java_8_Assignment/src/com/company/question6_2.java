package com.company;


interface content{
    
    
    static Integer sum(Integer integer1,Integer integer2){
        System.out.println("This is static method in interface...");
        return integer1+integer2;
    }
}


public class question6_2 {
    public static void main(String[] args) {
        content.sum(25,67);
    }
}
