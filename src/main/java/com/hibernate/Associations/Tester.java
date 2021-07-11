package com.hibernate.Associations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tid;
    private String tname;
    private String projname;
    private String tcompany;
    public int getTid() {
        return tid;
    }


    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public String getTcompany() {
        return tcompany;
    }

    public void setTcompany(String tcompany) {
        this.tcompany = tcompany;
    }


    public Tester() {
    }   public Tester(int tid, String tname, String projname, String tcompany) {
        this.tid = tid;
        this.tname = tname;
        this.projname = projname;
        this.tcompany = tcompany;
    }


    @Override
    public String toString() {
        return "Tester{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", projname='" + projname + '\'' +
                ", tcompany='" + tcompany + '\'' +
                '}';
    }
}
