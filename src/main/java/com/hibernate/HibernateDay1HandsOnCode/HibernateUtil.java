package com.hibernate.HibernateDay1HandsOnCode;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   static SessionFactory sessionFactory = null;
    static {
     sessionFactory= new Configuration().configure().buildSessionFactory();
    }
    public static SessionFactory  getSf(){
        return sessionFactory;
    }
}
