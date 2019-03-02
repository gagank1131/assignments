package com.company.question8;

public class Application implements DbFunctionality{
    
    User user;
    
    public Application(User user) {
        this.user = user;
    }
    
    @Override
    public void access() {
        System.out.println("access to the student records");
    }
}
