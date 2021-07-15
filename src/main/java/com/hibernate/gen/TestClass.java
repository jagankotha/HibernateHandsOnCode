package com.hibernate.gen;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestClass {
    public static void main ( String[] args ) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory ( ).openSession ( ) ) {
            transaction = session.beginTransaction ( );
            Employee employee = new Employee ( );
            employee.setEaddress ( "pbp" );
            employee.setEname ( "jaganmohanreddy k" );
            session.save ( employee );
            session.save ( employee );
            transaction.commit ( );
            session.close ( );

        }
    }
}
