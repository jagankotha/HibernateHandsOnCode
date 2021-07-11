package com.hibernate.gen;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MyGen implements IdentifierGenerator {

    @Override
    public Serializable generate ( SharedSessionContractImplementor session, Object object ) throws HibernateException {

        String date =new SimpleDateFormat ("yyyy-mm-dd").format(new Date ());
        int num=new Random ().nextInt(1000);
        String Prifix1 = "ST";
        String Prifix2 = "HIB";
        return Prifix1+date+Prifix2+"-"+num ;
    }
}
