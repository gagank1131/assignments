package com.ttn.hibernate_Assignment;

import com.ttn.hibernate_Assignment.repositories.AuthorCRUD;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        
        AuthorCRUD authorCRUD = new AuthorCRUD();
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        authorCRUD.createAuthor(session, "arpit", "gupta", 25,12,"shalimar bagh","delhi");
        
        session.getTransaction().commit();
        
        session.beginTransaction();
        authorCRUD.createAuthor(session, "prateek", "nagar", 25,20,"paschim vihar","delhi");
        session.getTransaction().commit();
        
        session.beginTransaction();
        authorCRUD.readAuthor(session, 1);
        session.getTransaction().commit();
        
        session.beginTransaction();
        authorCRUD.updateAuthor(session, 1, 21);
        session.getTransaction().commit();
        
//        session.beginTransaction();
//        authorCRUD.deleteAuthor(session, 1);
//        session.getTransaction().commit();
        
    session.close();
        
    }
}
