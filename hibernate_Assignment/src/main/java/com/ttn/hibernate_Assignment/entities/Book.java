package com.ttn.hibernate_Assignment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    
    private  String bookName;
    
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
