package com.company.question8;

public class proxyPattern {
    
    public static void main(String[] args) {
        User gagan = new User("admin");
        DbFunctionality app = new ApplicationProxy(gagan);
        app.access();
    }
}
