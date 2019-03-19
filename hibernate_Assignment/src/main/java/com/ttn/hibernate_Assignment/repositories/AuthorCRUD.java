package com.ttn.hibernate_Assignment.repositories;


import com.ttn.hibernate_Assignment.entities.Address;
import com.ttn.hibernate_Assignment.entities.Author;
import org.hibernate.Session;

public class AuthorCRUD {
    
    
    public void createAuthor(Session session, String firstName, String lastName, Integer age,Integer streetNumber,String location,String state) {
        Author author = new Author();
        Address address = new Address();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setAge(age);
        
        //----> embedded
        address.setStreetNumber(streetNumber);
        address.setLocation(location);
        address.setState(state);
        author.setAddress(address);
        
        //----> persisting collection
        author.getSubjects().add("java");
        author.getSubjects().add("spring");
        author.getSubjects().add("hibernate");
        
        session.save(author);
        
    }
    
    public void readAuthor(Session session, Integer id) {
        
        Author author1 = session.get(Author.class, id);
        System.out.println(author1);
        
    }
    
    public void updateAuthor(Session session, Integer id, Integer age) {
        
        Author author1 = session.get(Author.class, id);
        author1.setAge(age);
        session.update(author1);
        
        
    }
    
    
    public void deleteAuthor(Session session, Integer id) {
        
        Author author1 = session.get(Author.class, id);
        session.delete(author1);
        
    }
    
    
}
