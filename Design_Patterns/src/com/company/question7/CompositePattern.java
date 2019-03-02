package com.company.question7;

public class CompositePattern {
    
    public static void main(String[] args) {
        
        Developer developer1 = new Developer("Gagan", "java");
        Developer developer2 = new Developer("nishant", "c++");
        
        Manager manager1 = new Manager("lohit","senior");
        
        DeveloperDirectory developerDirectory = new DeveloperDirectory();
        developerDirectory.developerList.add(developer1);
        developerDirectory.developerList.add(developer2);
        
        ManagerDirectory managerDirectory = new ManagerDirectory();
        managerDirectory.managerList.add(manager1);
        
        CompanyDirectory companyDirectory = new CompanyDirectory();
        
        companyDirectory.companyDirectory.add(developerDirectory);
        companyDirectory.companyDirectory.add(managerDirectory);
        
        companyDirectory.ShowDirectoryDetails();
    }
    
    
}
