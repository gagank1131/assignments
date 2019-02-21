package Library_System;

public class Librarian implements Person {
    
    private String librarianName;
    private int librarianID;
    
    Librarian(String name, int id) {
        this.librarianName = name;
        this.librarianID = id;
    }
    
    // Interface method definition
    public void getPerson() {
        System.out.println("Name: " + librarianName);
        System.out.println("ID: " + librarianID);
    }
}
