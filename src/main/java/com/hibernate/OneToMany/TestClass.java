package com.hibernate.OneToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestClass {
    public static void main ( String[] args ) {
        HibernateUtil hibernateUtil = new HibernateUtil ();
         SessionFactory sessionFactory = hibernateUtil.getSessionFactory ();
        Session session = sessionFactory.openSession ();
        Transaction transaction = session.getTransaction ();
        transaction.begin ();

        Module module = new Module (     );
        module.setmName ( "Alarm Enrichment" );
        module.setpName ( "AIS Thailand" );

        Module module1 = new Module (     );
        module1.setmName ( "Alarm Report" );
        module1.setpName ( "AIS Thailand" );

        Module module2 = new Module (     );
        module2.setmName ( "Alarm Forwarding" );
        module2.setpName ( "AIS Thailand" );

        Module module3 = new Module (     );
        module3.setmName ( "Alarm WorkFlow" );
        module3.setpName ( "AIS Thailand" );

        Product product = new Product (      );
        product.setpName ( "AIS Thailand" );
        product.setpClient ( "LTC Thailand" );
        product.getHashSet ().add ( module   );
        product.getHashSet ().add ( module1  );
        product.getHashSet ().add ( module2  );
        product.getHashSet ().add ( module3   );

         session.save ( module   );
         session.save ( module1 );
         session.save ( module2 );
         session.save ( module3 );
         session.save ( product );
         transaction.commit ();
         session.close ();
    }
}
