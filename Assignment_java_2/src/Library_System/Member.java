package Library_System;

public class Member implements Person {
    
    private String memberName;
    private int memberID;
    
    Member(String name, int id) {
        memberName = name;
        memberID = id;
    }
    
    // Interface method definition
    public void getPerson() {
        System.out.println("Name: " + memberName);
        System.out.println("ID: " + memberID);
    }
}
