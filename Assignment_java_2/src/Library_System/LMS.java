package Library_System;

import java.util.ArrayList;

public class LMS {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        myLibrary.setLibraryLocation("Noida");
        Book b1 = new Book("Head First Java", "Eric S", 700.0f);
        Book b3 = new Book("Head First Design Patterns", "Donald Y", 900.0f);
        Book b2 = new Book("Head First HTML5 Programming", "David P", 800.0f);
        Book b4 = new Book("Head First HTML & CSS", "Henry T", 600.0f);
        
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        myLibrary.setBooksInLibrary(bookList);
        
        Librarian librarian = new Librarian("GAGAN KUSHEAHA", 3327);
        myLibrary.setLibrarian(librarian);
        
        Member m1 = new Member("ARPIT", 3328);
        Member m2 = new Member("LOHIT", 3335);
        Member m3 = new Member("PRATEEK", 3555);
        
        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        myLibrary.setMembersOfLibrary(memberList);
        myLibrary.getLibraryDetails();
    }
}