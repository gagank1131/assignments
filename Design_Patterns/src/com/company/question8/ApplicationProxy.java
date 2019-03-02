package com.company.question8;

public class ApplicationProxy extends Application {
    
    
    public ApplicationProxy(User user) {
        super(user);
    }
    
    @Override
    public void access() {
        if (user.getRole() == "admin") {
            System.out.println("you can access the students records..");
            super.access();
        }
        else
            System.out.println("ACCESS DENIED !!");
    }
}
