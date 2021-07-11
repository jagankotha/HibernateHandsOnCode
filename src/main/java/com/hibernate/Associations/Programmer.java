package com.hibernate.Associations;

import javax.persistence.*;

@Entity
public class Programmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String pname;
    private String projname;
    private String pcompany;
    public com.hibernate.Associations.Tester getTester() {
    return tester;
}@ManyToOne
    @JoinColumn(name = "sidfk")
    private Tester tester;

    public void setTester ( Tester tester ) {
        this.tester = tester;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public String getPcompany() {
        return pcompany;
    }

    public void setPcompany(String pcompany) {
        this.pcompany = pcompany;
    }

    public Programmer(int pid, String pname, String projname, String pcompany) {
        this.pid = pid;
        this.pname = pname;
        this.projname = projname;
        this.pcompany = pcompany;
    }
public Programmer() {
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", projname='" + projname + '\'' +
                ", pcompany='" + pcompany + '\'' +
                '}';
    }
}
