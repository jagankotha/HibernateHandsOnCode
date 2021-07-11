package com.hibernate.HibernateDay1HandsOnCode;

import javax.persistence.*;

@Entity
@Table(name = "student_result")

public class StudentResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Embedded
    private StudentAddress studentAddress;
    private String address;

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Lob
    private char[] description;

    public char[] getDescription() {
        return description;
    }

    public void setDescription(char[] description) {
        this.description = description;
    }

    @Lob
    private byte[] simg;

    private int marks;

    public byte[] getSimg() {
        return simg;
    }

    public void setSimg(byte[] simg) {
        this.simg = simg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public StudentResult() {
    }

    public StudentResult(int id, String name, String address, int marks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "StudentResult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentAddress=" + studentAddress +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}
