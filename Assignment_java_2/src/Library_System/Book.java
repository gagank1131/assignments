package Library_System;

public class Book {
    private String bookName;
    private String bookAuthor;
    private float bookPrice;
    
    Book(String name, String author, float price) {
        bookName = name;
        bookAuthor = author;
        bookPrice = price;
    }
    
    void getBookDetails() {
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: " + bookPrice);
    }
}
