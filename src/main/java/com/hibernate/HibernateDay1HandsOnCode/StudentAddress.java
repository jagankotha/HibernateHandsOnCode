package com.hibernate.HibernateDay1HandsOnCode;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class StudentAddress {
    private String hno;
    private String area;

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public StudentAddress(String hno, String area) {
        this.hno = hno;
        this.area = area;
    }

    public StudentAddress() {
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "hno='" + hno + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
