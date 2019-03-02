package com.company.question7;

public class Manager implements Directory {
    
    private String name;
    private String type;
    
    @Override
    public void ShowDirectoryDetails() {
        System.out.println("Manager name :" + name + " Type:" + type);
    }
    
    public Manager(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
