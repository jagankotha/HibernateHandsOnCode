package com.hibernate.OneToMany;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory sessionFactory = null;
    static {
        sessionFactory = new Configuration (  ).configure ().addAnnotatedClass ( Module.class ).addAnnotatedClass ( Product.class ).buildSessionFactory ();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
