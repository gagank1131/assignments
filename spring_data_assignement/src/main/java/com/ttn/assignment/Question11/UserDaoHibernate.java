package com.ttn.assignment.Question11;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoHibernate {
    
    @Autowired
    SessionFactory sessionFactory;
    
    void sessionFactoryDemo() {

            String sql = "SELECT COUNT(*) FROM Person";

            Query query = sessionFactory.openSession().createQuery(sql);
            System.out.println(query.uniqueResult());
       
    }
    
}
