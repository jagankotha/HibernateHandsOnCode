package com.hibernate.gen;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue (generator="abc")
    @GenericGenerator (name="abc",strategy="com.hibernate.gen.MyGen")
    private  String eid;
    private String ename;
    private String eaddress;

    public String getEid ( ) {
        return eid;
    }

    public void setEid ( String eid ) {
        this.eid = eid;
    }

    public String getEname ( ) {
        return ename;
    }

    public void setEname ( String ename ) {
        this.ename = ename;
    }

    public String getEaddress ( ) {
        return eaddress;
    }

    public void setEaddress ( String eaddress ) {
        this.eaddress = eaddress;
    }

    public Employee ( String eid, String ename, String eaddress ) {
        this.eid = eid;
        this.ename = ename;
        this.eaddress = eaddress;
    }

    @Override
    public String toString ( ) {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", ename='" + ename + '\'' +
                ", eaddress='" + eaddress + '\'' +
                '}';
    }

    public Employee ( ) {
    }
}
