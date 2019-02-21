package Library_System;

import java.util.ArrayList;

public class Library {
    private String libraryLocation;
    private ArrayList<Book> booksInLibrary;
    private ArrayList<Member> membersOfLibrary;
    private Librarian librarian;
    
    public String getLibraryLocation() {
        return libraryLocation;
    }
    
    public void setLibraryLocation(String libraryLocation) {
        this.libraryLocation = libraryLocation;
    }
    
    public ArrayList<Book> getBooksInLibrary() {
        return booksInLibrary;
    }
    
    public void setBooksInLibrary(ArrayList<Book> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
    }
    
    public ArrayList<Member> getMembersOfLibrary() {
        return membersOfLibrary;
    }
    
    public void setMembersOfLibrary(ArrayList<Member> membersOfLibrary) {
        this.membersOfLibrary = membersOfLibrary;
    }
    
    public Librarian getLibrarian() {
        return librarian;
    }
    
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    
    void getLibraryDetails() {
        System.out.println("___LIBRARY DETAILS___");
        System.out.println("LOCATION: " + libraryLocation);
        System.out.println("LIBRARIAN:");
        librarian.getPerson();
        
        System.out.println("MEMBERS:");
        for (Member m : membersOfLibrary)
            m.getPerson();
        
        System.out.println("BOOKS:");
        for (Book b : booksInLibrary)
            b.getBookDetails();
    }
}
