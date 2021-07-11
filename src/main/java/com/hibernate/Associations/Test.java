package com.hibernate.Associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
    public static void main(String args[])
    {
       HibernateUtil hibernateUtil = new HibernateUtil ();
        Session session =  hibernateUtil.getSessionFactory().openSession ();

        Transaction transaction = session.getTransaction ();
        transaction.begin ();
        Tester tester = new Tester (     );
        tester.setProjname ( "AisThailand" );
        tester.setTname ( "kajal pandey" );
        tester.setTcompany ( "Huawei" );

        Programmer programmer = new Programmer (  );
        programmer.setPcompany ( "huawei" );
        programmer.setPname ( "jagan" );
        programmer.setProjname ( "Ais Thailand" );
        programmer.setTester ( tester);

        Programmer programmer1 = new Programmer (  );
        programmer1.setPcompany ( "huawei" );
        programmer1.setPname ( "mythri" );
        programmer1.setProjname ( "Ais Thailand" );
        programmer1.setTester ( tester);

        Programmer programmer2 = new Programmer (  );
        programmer2.setPcompany ( "huawei" );
        programmer2.setPname ( "Yugesh" );
        programmer2.setProjname ( "Ais Thailand" );
        programmer2.setTester ( tester);

       session.save ( programmer );
       session.save ( programmer1    );
       session.save ( programmer2    );
       session.save ( tester );
      transaction.commit ();
      session.close ();


    }
}
