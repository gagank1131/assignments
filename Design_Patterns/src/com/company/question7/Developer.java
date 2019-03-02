package com.company.question7;

public class Developer implements Directory {
    private String name;
    private String language;
    
    public Developer(String name, String language) {
        this.name = name;
        this.language = language;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void ShowDirectoryDetails() {
        System.out.println("Developer name :"+name+" language: "+language);
    }
    
    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
