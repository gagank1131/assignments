package com.company;

@FunctionalInterface
interface ConstructDetails {
    employee getDetails(String name, Integer age, String city);
}

class employee {
    
    private String name;
    private Integer age;
    private String city;
    
    public employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class question4 {
    
    public static void main(String[] args) {
        
        ConstructDetails constructDetails = employee::new;
        employee e1 = constructDetails.getDetails("gagan", 25, "delhi");
        System.out.println(e1);
        
        
    }
}
