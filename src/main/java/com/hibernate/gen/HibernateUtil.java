package com.hibernate.gen;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory sessionFactory = null;
    static {
        try {
            sessionFactory = new Configuration (  ).configure ("hibernate.cfg.xml").addAnnotatedClass ( Employee.class ).buildSessionFactory ();
        }catch ( Exception e ){
            e.printStackTrace ();
        }
    }

    public static SessionFactory getSessionFactory(){
        return  sessionFactory;
    }
}
