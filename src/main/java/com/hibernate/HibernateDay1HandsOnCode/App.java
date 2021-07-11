package com.hibernate.HibernateDay1HandsOnCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.transaction.Transactional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
@Transactional
public class App 
{
    public static void main( String[] args ) throws IOException {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml").addAnnotatedClass(StudentResult.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

        FileInputStream fileInputStream = new FileInputStream("E:\\SpringBootProjectsForHandsOnPractice\\Spring-Cloud-Project\\HibernateDay1HandsOnCode\\src\\main\\resources\\download (1).jpg");
        byte[] data = new byte[fileInputStream.available()];
        fileInputStream.read(data);
        String string ="hello welcome to the hibernate programming language heree";
        char ch[] = string.toCharArray();
        StudentResult studentResult = new StudentResult();
        studentResult.setName("jagan");
        studentResult.setAddress("pbp");
        studentResult.setMarks(324);
        studentResult.setSimg(data);
        studentResult.setDescription(ch);
        StudentResult studentResult1 = new StudentResult();
        studentResult1.setName("jaganmohanreddy");
        studentResult1.setId(2);
      StudentAddress studentAddress = new StudentAddress();
      studentAddress.setArea("Chennekothapalli");
      studentAddress.setHno("6-21");

        try {
            session.save(studentResult);
            //session.update(studentResult1);
            System.out.println("data saved");
            StudentResult studentResult2 = session.load(studentResult.getClass(),1);
            StudentResult studentResult3 = session.get(StudentResult.class, 4);
            System.out.println(studentResult2);
            System.out.println(studentResult3);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            transaction.commit();
            session.close();

        }

    }
}
