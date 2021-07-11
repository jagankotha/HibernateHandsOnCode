package com.hibernate.Associations;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static  SessionFactory sessionFactory = null;
    static{
        sessionFactory =  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass ( Programmer.class ).addAnnotatedClass ( Tester.class ).buildSessionFactory();

    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
